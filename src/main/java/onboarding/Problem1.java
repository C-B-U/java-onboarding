package onboarding;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

class Problem1 {

    public static final int EXCEPTION_NUMBER = -1;
    public static final int POBI_WINNER = 1;
    public static final int CRONG_WINNER = 2;
    public static final int NO_WINNER = 0;

    public static final int LEFT_PAGE = 0;
    public static final int RIGHT_PAGE = 1;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if (!(checkValidationOfList(pobi) && checkValidationOfList(crong))) {
            return EXCEPTION_NUMBER;
        }

        int pobiMax = Collections.max(pobi.stream()
                .map(i -> Math.max(splitPageNumber(i).sum(), multifySplitNumber(splitPageNumber(i))))
                .collect(Collectors.toList()));

        int crongMax = Collections.max(crong.stream()
                .map(i -> Math.max(splitPageNumber(i).sum(), multifySplitNumber(splitPageNumber(i))))
                .collect(Collectors.toList()));

        return getResult(crongMax, pobiMax);
    }

    private static int getResult(int crongMax, int pobiMax) {
        BiPredicate<Integer, Integer> biPredicate =
                (crong, pobi) -> crong > pobi;

        if (crongMax == pobiMax) {
            return NO_WINNER;
        }

        if (biPredicate.test(crongMax, pobiMax)) {
            return CRONG_WINNER;
        }

        return POBI_WINNER;
    }

    private static int multifySplitNumber(IntStream intStream) {
        return intStream.reduce(1, (a,b) -> a*b);
    }

    private static IntStream splitPageNumber(int num) {
        return stream(splitStringArray(num)).mapToInt(Integer::parseInt);
    }

    private static String[] splitStringArray(final int num) {
        return Integer.toString(num).split("");
    }

    private static boolean checkValidationOfList(List<Integer> list) {
        if (checkListLength(list)) {
            return checkValidationOfPageNumber(list);
        }
        throw new IllegalArgumentException();
    }

    private static boolean checkListLength(List<Integer> list) {
        if (list.size() != 2) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    private static boolean checkValidationOfPageNumber(List<Integer> list) {
        if (list.get(LEFT_PAGE) >= 1 && list.get(RIGHT_PAGE) <= 400) {
            return checkLeftAndRight(list);
        }
        throw new IllegalArgumentException();
    }

    private static boolean checkLeftAndRight(List<Integer> list) {
        if (list.get(LEFT_PAGE) + 1 != list.get(RIGHT_PAGE)) {
            return false;
        }
        return true;
    }
}