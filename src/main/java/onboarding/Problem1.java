package onboarding;

import org.mockito.internal.matchers.Null;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Collections.max;

class Problem1 {

    public static final int CRONG_WIN = 2;
    public static final int POBI_WIN = 1;
    public static final int NO_WINNER = 0;



    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        Stream<String> pobiPage = getPage(pobi);
        Stream<String> crongPage = getPage(crong);

        int pobiMaxPage = getMaxPage(getPageSumMax(pobiPage), getPageMultiMax(pobiPage));
        int crongMaxPage = getMaxPage(getPageSumMax(crongPage), getPageMultiMax(crongPage));

        return getWinner(pobiMaxPage, crongMaxPage);

    }


    private static Stream<String> getPage(List<Integer> user) {
        return user.stream().map(Object::toString);
    }

    private static int getPageSumMax(Stream<String> page) {
        return page.mapToInt(str -> str.chars()
                        .map(Character::getNumericValue)
                        .sum())
                .max().orElseThrow(NullPointerException::new);
    }

    private static int getPageMultiMax(Stream<String> page) {
        return page.mapToInt(str -> str.chars()
                        .map(Character::getNumericValue)
                        .reduce(1, (a, b) -> a * b))
                .max().orElseThrow(NullPointerException::new);
    }

    private static int getMaxPage(int pageSumMax, int pageMultiMax) {
        return Math.max(pageSumMax, pageMultiMax);
    }

    private static int getWinner(int pobiMaxPage, int crongMaxPage) {
        if (pobiMaxPage > crongMaxPage)
            return CRONG_WIN;
        else if (pobiMaxPage == crongMaxPage)
            return NO_WINNER;
        else
            return POBI_WIN;
    }






}