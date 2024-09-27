package onboarding;

import onboarding.problem6.Crews;

import java.util.*;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        return new Crews(forms).getResultEmail();
    }

}
