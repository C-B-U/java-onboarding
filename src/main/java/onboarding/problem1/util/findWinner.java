package onboarding.problem1.util;

public final class findWinner {
    public static final int CRONG_WIN = 2;
    public static final int POBI_WIN = 1;
    public static final int NO_WINNER = 0;

    public static int getWinner(int pobiMaxPage, int crongMaxPage) {
        if (isPobiWin(pobiMaxPage, crongMaxPage))
            return POBI_WIN;

        if (isCrongWin(pobiMaxPage, crongMaxPage))
            return CRONG_WIN;

        return NO_WINNER;
    }

    public static boolean isPobiWin(int pobiMaxPage, int crongMaxPage) {
        if (pobiMaxPage > crongMaxPage) {
            return true;
        }
        return false;
    }

    public static boolean isCrongWin(int pobiMaxPage, int crongMaxPage) {
        if (crongMaxPage > pobiMaxPage) {
            return true;
        }
        return false;
    }

}
