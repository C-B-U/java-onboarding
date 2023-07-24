package onboarding;

import onboarding.problem6.Crews;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        return new Crews(forms).getResultEmail();
    }

    public static void validKoreanNickName(List<List<String>> forms) {
        List<String> nickName = forms.stream()
                .map(form -> form.get(1))
                .collect(Collectors.toList());

        for (int i = 0; i < nickName.size(); i++) {

        }
    }

}
