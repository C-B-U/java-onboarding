package onboarding;

import onboarding.problem4.Alphabet;
import static onboarding.problem4.Alphabet.mapAlphabet;

public class Problem4 {
    public static String solution(String word) {
        Alphabet.getMapAlphabetToReverse();
        return getResult(word);
    }

    public static String getResult(String word){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if (ch == ' '){
                sb.append(' ');
            }else if (isLower(ch)) {
                sb.append(toLower(mapAlphabet.get(toUpper(ch))));
            }else{
                sb.append(mapAlphabet.get(ch));
            }

        }
        return sb.toString();
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
