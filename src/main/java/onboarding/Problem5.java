package onboarding;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        if (!checkValiation(money)) {
            throw new IllegalArgumentException();
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
