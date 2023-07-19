package onboarding;

public class Problem4 {

    public static final int UPPER_CASE = 65;
    public static final int LOWER_CASE = 97;

    public static String solution(String word) {
        String answer = "";
        return answer;
    }
    private static int checkAlphabetCase(char word) {
        return Character.isUpperCase(word) ? UPPER_CASE : LOWER_CASE;
    }

    public static boolean checkValidation(String word) {
        if (word.length() < 1 || word.length() > 1000) {
            return false;
        }
        return true;
    }
}