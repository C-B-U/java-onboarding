package onboarding.problem6;

public class Crew {

    private String email;
    private String name;

    Crew(String email, String name) {
        validEmailType();
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }

    private void validEmailType(){
        if(!email.contains("email.com")){
            throw new IllegalArgumentException("이메일은 'email.com' 도메인만 가능합니다.");
        }
    }



}
