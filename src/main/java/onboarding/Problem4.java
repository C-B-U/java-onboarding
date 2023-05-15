package onboarding;

import java.util.Arrays;
import java.util.List;


public class Problem4 {

    public static TreeFrog treeFrog;

    public static String solution(String word) {

        try {
            treeFrog.setTreeFrog(word);
            String answer = treeFrog.toTreeFrogWord(word);
            return answer;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }


    }

    static class TreeFrog {

        static final int minLength = 1;
        static final int maxLength = 1000;

        static final List<Character> normalUpperAlpha = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        static final List<Character> reversedUpperAlpha = Arrays.asList('Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A');
        static final List<Character> normalLowerAlpha = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        static final List<Character> reversedLowerAlpha = Arrays.asList('z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a');

        private TreeFrog(String word) {
        }
        
        private static TreeFrog setTreeFrog(String word) {
            checkCorrectWord(word);
            return new TreeFrog(word);
        }

        private static void checkCorrectWord(String word) {
            if(word.length() < minLength || word.length() > maxLength)
                throw new IllegalArgumentException("out of word length");

        }

        private static Character toTreeFrogChar(char checkWord) {
            if(checkWord >= 65 && checkWord <= 90)  //대문자인 경우
                return reversedUpperAlpha.get(normalUpperAlpha.indexOf(checkWord));
            if(checkWord >= 97 && checkWord <= 122)  //소문자인 경우
                return reversedLowerAlpha.get(normalLowerAlpha.indexOf(checkWord));
            return checkWord;
        }

        private static String toTreeFrogWord(String word) {
            String result = "";
            for(int  i = 0; i < word.length(); i++)
                result += toTreeFrogChar(word.charAt(i));
            return result;
        }

    }

}
