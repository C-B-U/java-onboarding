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
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        Stream<String> pobiPage = getPage(pobi);
        Stream<String> crongPage = getPage(crong);

        int pobiMaxPage = getMaxPage(getPageSumMax(pobiPage), getPageMultiMax(pobiPage));
        int cringMaxPage = getMaxPage(getPageSumMax(crongPage), getPageMultiMax(crongPage));


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




}