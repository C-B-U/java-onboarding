package onboarding;

import java.util.*;
import java.util.stream.Collectors;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        Map<String, String> mapCrew = forms.stream()
                .collect(Collectors.toMap(
                        form -> form.get(1),
                        form -> form.get(0)
                ));

        List<String> nickNames = forms.stream()
                .map(form -> form.get(1))
                .collect(Collectors.toList());



        return answer;
    }
}
