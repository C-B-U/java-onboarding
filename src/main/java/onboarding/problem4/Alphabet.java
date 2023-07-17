package onboarding.problem4;

import java.util.HashMap;
import java.util.Map;

public final class Alphabet {
    private static final Map<Character, Character> mapAlphabet = new HashMap<>(26);

    public final Map<Character, Character> getMapAlphabetToReverse(){
       for(char c = 'A'; c <= 'Z'; c++){
           char reverseChar = (char)('Z' - (c - 'A'));
           mapAlphabet.put(c, reverseChar);
       }
       return mapAlphabet;
    }
}
