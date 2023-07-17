package onboarding.problem4;

import static onboarding.problem4.Alphabet.mapAlphabet;

public class Sentence {

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
        if (ch >= 'a' && ch <= 'z'){
            sb.append(toLower(mapAlphabet.get(toUpper(ch))));
        }
    }

    private void whenUpper(char ch){
        if (ch >= 'A' && ch <= 'Z'){
            sb.append(mapAlphabet.get(ch));
        }
    }

    private char toUpper(char ch){
        return (char)(ch - 32);
    }

    private char toLower(char ch){
        return (char)(ch + 32);
    }
}

