package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem5 {

    public static List<Integer> solution(int money) {
        if (!checkValiation(money)) {
            throw new IllegalArgumentException();
        }

        int leftMoney = money;
        int[] moneyArray = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < moneyArray.length; i++) {
            if(leftMoney < moneyArray[i]) {
                answer.add(0);
                continue;
            }
            answer.add(leftMoney/moneyArray[i]);
            leftMoney = leftMoney % moneyArray[i];
        }
        return answer;
    }

    private static boolean checkValiation(int money) {
        if(money < 1 || money > 1000000) {
            return false;
        }
        return true;
    }
}
