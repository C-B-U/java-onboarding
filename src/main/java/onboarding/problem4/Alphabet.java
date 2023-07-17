package onboarding.problem4;

import java.util.HashMap;
import java.util.Map;

public final class Alphabet {
    public static final Map<Character, Character> mapAlphabet = new HashMap<>(26);

    public static void getMapAlphabetToReverse(){
       for(char c = 'A'; c <= 'Z'; c++){
           char reverseChar = (char)('Z' - (c - 'A'));
           mapAlphabet.put(c, reverseChar);
       }
    }
}
