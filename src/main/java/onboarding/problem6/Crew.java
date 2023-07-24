package onboarding.problem6;

public class Crew {

    private String email;
    private String name;

    Crew(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }
}
