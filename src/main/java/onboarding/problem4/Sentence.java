package onboarding.problem4;

import static onboarding.problem4.Alphabet.mapAlphabet;

public class Sentence {

    public final static Character START_LOWER_ALPHABET = 'a';
    public final static Character END_LOWER_ALPHABET = 'z';
    public final static Character START_UPPER_ALPHABET = 'A';
    public final static Character END_UPPER_ALPHABET = 'Z';
    public final static int CHANGE_ALPHABET_SIZE = 32;

    private final String sentence;
    private final StringBuilder sb = new StringBuilder();

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getResult(){
        Alphabet.getMapAlphabetToReverse();
        for(int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            whenBlank(ch);
            whenLower(ch);
            whenUpper(ch);
        }
        return sb.toString();
    }

    private void whenBlank(char ch){
        if(ch == ' '){
            sb.append(' ');
        }
    }

    private void whenLower(char ch){
        if (ch >= START_LOWER_ALPHABET && ch <= END_LOWER_ALPHABET){
            sb.append(toLower(mapAlphabet.get(toUpper(ch))));
        }
    }

    private void whenUpper(char ch){
        if (ch >= START_UPPER_ALPHABET && ch <= END_UPPER_ALPHABET){
            sb.append(mapAlphabet.get(ch));
        }
    }

    private char toUpper(char ch){
        return (char)(ch - CHANGE_ALPHABET_SIZE);
    }

    private char toLower(char ch){
        return (char)(ch + CHANGE_ALPHABET_SIZE);
    }
}

