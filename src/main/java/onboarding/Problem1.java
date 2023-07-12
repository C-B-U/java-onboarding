package onboarding;


import java.util.List;
import java.util.stream.Stream;



class Problem1 {

    public static final int CRONG_WIN = 2;
    public static final int POBI_WIN = 1;
    public static final int NO_WINNER = 0;
    public static final int isNotCorrectPage = -1;


    public static int solution(List<Integer> pobi, List<Integer> crong) {

        if (isNotCorrectPage(pobi) || isNotCorrectPage(crong)) {
            return isNotCorrectPage;
        }
        int pobiMaxPage = getMaxPage(getPageSumMax(pobi), getPageMultiMax(pobi));
        int crongMaxPage = getMaxPage(getPageSumMax(crong), getPageMultiMax(crong));

        return getWinner(pobiMaxPage, crongMaxPage);

    }


    private static Stream<String> getPage(List<Integer> user) {
        return user.stream().map(Object::toString);
    }

    private static int getPageSumMax(List<Integer> user) {
        Stream<String> page = getPage(user);
        return page.mapToInt(str -> str.chars()
                        .map(Character::getNumericValue)
                        .sum())
                .max().orElseThrow(NullPointerException::new);
    }

    private static int getPageMultiMax(List<Integer> user) {
        Stream<String> page = getPage(user);
        return page.mapToInt(str -> str.chars()
                        .map(Character::getNumericValue)
                        .reduce(1, (a, b) -> a * b))
                .max().orElseThrow(NullPointerException::new);
    }

    private static int getMaxPage(int pageSumMax, int pageMultiMax) {
        return Math.max(pageSumMax, pageMultiMax);
    }

    private static int getWinner(int pobiMaxPage, int crongMaxPage) {
        if (isPobiWin(pobiMaxPage, crongMaxPage))
            return POBI_WIN;

        if (isCrongWin(pobiMaxPage, crongMaxPage))
            return CRONG_WIN;

        return NO_WINNER;
    }

    private static boolean isPobiWin(int pobiMaxPage, int crongMaxPage) {
        if (pobiMaxPage > crongMaxPage) {
            return true;
        }
        return false;
    }

    private static boolean isCrongWin(int pobiMaxPage, int crongMaxPage) {
        if (crongMaxPage > pobiMaxPage) {
            return true;
        }
        return false;
    }

    private static boolean validateLeftRightPage(List<Integer> user) {
        if (user.get(0) == (user.get(1) - 1)) {
            return true;
        }
        return false;
    }

    private static boolean validateStartOrEndPage(List<Integer> user) {
        if (user.get(0) >= 1 && user.get(1) <= 400) {
            return true;
        }
        return true;
    }

    private static boolean validatePageLength(List<Integer> user) {
        if (user.size() == 2) {
            return true;
        }
        return false;
    }

    private static boolean isNotCorrectPage(List<Integer> user) {
        if (validateLeftRightPage(user) && validateStartOrEndPage(user) && validatePageLength(user)) {
            return false;
        }
        return true;
    }

}