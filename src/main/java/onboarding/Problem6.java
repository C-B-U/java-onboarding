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

        Set<String> email = new TreeSet<>();
        for(int i = 0; i < nickNames.size(); i++){
            for (int j = 0; j < nickNames.get(i).length()-1; j++){
                String str = nickNames.get(i).substring(j, j+2);
                for (int k = i+1; k < nickNames.size()-1; k++){
                    if(nickNames.get(k).contains(str)){
                        email.add(mapCrew.get(nickNames.get(i)));
                        email.add(mapCrew.get(nickNames.get(k)));
                    }
                }

            }
        }
        answer = new ArrayList<>(email);

        return answer;
    }
}
