package onboarding;

public class Problem4 {

    public static final int UPPER_CASE = 65;
    public static final int LOWER_CASE = 97;

    public static String solution(String word) {
        String answer = "";
        return answer;
    }

    public static String getResult(char[] wordArray) {
        String result = "";

        for (int index=0; index<wordArray.length; index++) {
            if (!(Character.isUpperCase(wordArray[index]) || Character.isLowerCase(wordArray[index]))) {
                result = result + ' ';
                continue;
            }
            result += String.valueOf((char) ((checkAlphabetCase(wordArray[index]) + 25)
                    - Math.abs(checkAlphabetCase(wordArray[index]) - wordArray[index])));
        }
        return result;
    }

    private static int checkAlphabetCase(char word) {
        return Character.isUpperCase(word) ? UPPER_CASE : LOWER_CASE;
    }

    public static char[] wordToCharArray(String word) {
        if (checkValidation(word)) {
            return word.toCharArray();
        }
        throw new IllegalArgumentException();
    }

    public static boolean checkValidation(String word) {
        if (word.length() < 1 || word.length() > 1000) {
            return false;
        }
        return true;
    }
}