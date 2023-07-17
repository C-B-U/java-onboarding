package onboarding;

import onboarding.problem4.Alphabet;
import static onboarding.problem4.Alphabet.mapAlphabet;

public class Problem4 {
    public static String solution(String word) {
        Alphabet.getMapAlphabetToReverse();
        return getResult(word);
    }


    public static boolean isLower(char ch){
        return ch >= 'a' && ch <= 'z';
    }

    public static char toUpper(char ch){
        return (char) (ch - 32);
    }

    public static char toLower(char ch){
        return (char)(ch + 32);
    }
}
