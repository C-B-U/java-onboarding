package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem5 {

    public static Withdraw withdraw;

    public static List<Integer> solution(int money) {

        try {
            withdraw.setWithdraw(money);
            List<Integer> answer = withdraw.toCashNumber(money);
            return answer;
        } catch (IllegalArgumentException e) {
            return Collections.emptyList();
        }


    }

    static class Withdraw {

        static final int minWithdrawMoney = 1;
        static final int maxWithdrawMoney = 1000000;
        static final List<Integer> cashUnit = Arrays.asList(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);


        private Withdraw(int money) {

        }

        private static Withdraw setWithdraw(int money) {
            isPossibleMoney(money);
            return new Withdraw(money);
        }

        private static void isPossibleMoney(int money) {
            if (money < minWithdrawMoney || money > maxWithdrawMoney)
                throw new IllegalArgumentException();

        }

        private static List<Integer> toCashNumber(int money) {
            List<Integer> cash = new ArrayList<>();

            for (int unit : cashUnit) {
                cash.add(money / unit);
                money -= unit * (money / unit);
            }
            return cash;
        }


    }

}
