package onboarding;

import java.util.List;

class Problem1 {

    public static final int EXCEPTION_NUMBER = -1;
    public static final int POBI_WINNER = 1;
    public static final int CRONG_WINNER = 2;
    public static final int NO_WINNER = 0;

    public static final int LEFT_PAGE = 0;
    public static final int RIGHT_PAGE = 1;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        System.out.println(pobi+ " "+ crong);
        int pobiRight = pobi.get(0);
        int pobiLeft = pobi.get(1);
        int crongRight = crong.get(0);
        int crongLeft = crong.get(1);

        return 0;
    }

    // 더하기
    private static int arrAdd(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number%10;
            number /= 10;
        }

        return sum;
    }

    // 곱하기
    private static int arrMul(int number) {
        int sum = 0;
        while (number > 0) {
            sum *= number%10;
            number /= 10;
        }

        return sum;
    }

    private Boolean checkMax(int right, int left) {

        int addMax = 0;
        int mulMax = 1;

        if (arrAdd(right) > arrAdd(left)) {
            addMax = 0;
        }

        return true;
    }
}