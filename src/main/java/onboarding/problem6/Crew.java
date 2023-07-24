package onboarding.problem6;

import java.util.regex.Pattern;

public class Crew {

    private String email;
    private String name;

    Crew(String email, String name) {
        validEmailType();
        validEmailLength();
        this.email = email;

        validNickNameLength();
        validKoreanNickName();
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

    private void validEmailLength() {
        if (email.length() < 11 || email.length() >= 20){
            throw new IllegalArgumentException("이메일 길이는 11자 이상 20자 미만입니다.");
        }
    }





}
