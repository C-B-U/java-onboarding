package onboarding.problem6;

import java.util.List;
import java.util.stream.Collectors;

public class Crews {

    private List<Crew> crews;
    private List<String> nicknames;

    public Crews(List<List<String>> forms) {
        this.crews = mapCrewsList(forms);
        this.nicknames = mapNicknames();
    }



    public List<Crew> mapCrewsList(List<List<String>> forms) {
        crewCountErrorHandler(forms);
        return forms.stream()
                .map(form -> new Crew(form.get(0), form.get(1)))
                .collect(Collectors.toList());
    }

    public List<String> mapNicknames(){
       return crews.stream().map(Crew::getName).collect(Collectors.toList());
    }


    public List<String> getResultEmail() {
        return duplicateNames().stream()
                .flatMap(filterNickname -> crews.stream()
                        .filter(crew -> filterNickname.equals(crew.getName()))
                        .map(Crew::getEmail))
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

    private List<String> duplicateNames(){
        return nicknames.stream()
                .filter(nickname -> {
                    List<String> separated = new NameSeparate(nickname).getSeparatedNickname();
                    return crews.stream()
                            .map(Crew::getName)
                            .filter(name -> !name.equals(nickname)) // Exclude the same nickname
                            .anyMatch(name -> separated.stream().anyMatch(name::contains));
                }).collect(Collectors.toList());
    }

    private void crewCountErrorHandler(List<List<String>> forms){
        if((long) forms.size() < 1 || (long) forms.size() > 10000){
            throw new IllegalArgumentException("크루는 1명 이상 10,000명 이하입니다.");
        }
    }
}


