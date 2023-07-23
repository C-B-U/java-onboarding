package onboarding.problem6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Crew {

    private final String email;
    private final String name;

    Crew(String email, String name){
        this.email = email;
        this.name = name;
    }


    List<Crew> crewsList (List<List<String>> forms) {
        return forms.stream()
                .map(form -> new Crew(form.get(0), form.get(1)))
                .collect(Collectors.toList());
    }
}
