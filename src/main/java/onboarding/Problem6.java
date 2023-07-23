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

    public static void crewCountErrorHandler(List<List<String>> forms){
        if((long) forms.size() < 1 || (long) forms.size() > 10000){
            throw new IllegalArgumentException("크루는 1명 이상 10,000명 이하입니다.");
        }
    }

    public static void validEmailType(List<List<String>> forms){
        List<String> email = forms.stream()
                .map(form -> form.get(0))
                .collect(Collectors.toList());
        for (int i = 0; i < email.size(); i++){
            if(!email.contains("email.com")){
                throw new IllegalArgumentException("이메일은 'email.com' 도메인만 가능합니다.")
            }
        }
    }


}
