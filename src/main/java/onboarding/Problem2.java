package onboarding;

import static java.lang.Character.isLowerCase;

public class Problem2 {

    public static Password password;

    public static String solution(String cryptogram) {

        try {
            password.setPassword(cryptogram);
            String answer = password.decode(cryptogram);
            return answer;

        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }

    }

    static class Password {
        static final int minLength = 1;
        static final int maxLength = 1000;

        static private String word;

        private Password(String word) {
        }

        private static Password setPassword(String word) {
            checkCorrectWord(word);
            return new Password(word);
        }

        private static void checkCorrectWord(String word) {
            isCorrectRangeOfLength(word.length());
            isLowerCaseWord(word);
        }

        private static void isLowerCaseWord(String word) {
            if(!word.toLowerCase().equals(word)) {
                throw new IllegalArgumentException("not lowercase word Exception");
            }
        }

        private static void isCorrectRangeOfLength(int length) {
            if(length < minLength || length > maxLength) {
                throw new IllegalArgumentException("not correct range of length Exception");
            }
        }

        private static String decode(String word) {
            int index = 0;
            while(index < word.length()-1 && word.length() > 1) {
                if(word.charAt(index) == word.charAt(++index)) {
                    word = word.substring(0, index-1) + word.substring(index+1);
                    index -= 2;
                }
            }
            return word;
        }




    }
}
