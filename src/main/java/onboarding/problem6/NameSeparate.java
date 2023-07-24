package onboarding.problem6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NameSeparate {

    List<String> separatedNickname;

    NameSeparate(String nickname){
        this.separatedNickname = separateNickname(nickname);
    }

    private List<String> separateNickname(String nickname){
       return IntStream.range(0, nickname.length()-1)
               .mapToObj(i -> nickname.substring(i, i+2))
               .collect(Collectors.toList());
    }

    public List<String> getSeparatedNickname() {
        return separatedNickname;
    }
}
