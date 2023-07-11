package onboarding;

public class Problem2 {
    public static final int START_INDEX = 0;
    public static final boolean CONTINUE = false;
    public static final boolean BREAK = true;

    public static String solution(String cryptogram) {
        if (!checkValidationString(cryptogram)) {
            throw new IllegalArgumentException();
        }

    private static StringBuffer setStringBuffer(String string) {
        return new StringBuffer(string);
    }

    }
    private static boolean checkValidationString(String cryptogram) {
        if (cryptogram.length() > 1000
                || cryptogram.length() < 1
                || !cryptogram.equals(cryptogram.toLowerCase())) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}
