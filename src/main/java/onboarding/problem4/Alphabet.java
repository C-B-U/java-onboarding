package onboarding.problem4;

import java.util.HashMap;
import java.util.Map;

import static onboarding.problem4.Sentence.END_UPPER_ALPHABET;
import static onboarding.problem4.Sentence.START_UPPER_ALPHABET;

public final class Alphabet {
    public static final Map<Character, Character> mapAlphabet = new HashMap<>(26);

    public static void getMapAlphabetToReverse(){
       for(char c = START_UPPER_ALPHABET; c <= END_UPPER_ALPHABET; c++){
           char reverseChar = (char)(END_UPPER_ALPHABET - (c - START_UPPER_ALPHABET));
           mapAlphabet.put(c, reverseChar);
       }
    }
}
