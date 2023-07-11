package onboarding;

public class Problem2 {
    public static final int START_INDEX = 0;
    public static final boolean CONTINUE = false;
    public static final boolean BREAK = true;

    public static String solution(String cryptogram) {
        if (!checkValidationString(cryptogram)) {
            throw new IllegalArgumentException();
        }
        return getResult(setStringBuffer(cryptogram));
    }

    private static StringBuffer setStringBuffer(String string) {
        return new StringBuffer(string);
    }

    private static String getResult(StringBuffer strBuffer) {
        while (true) {
            if (checkEachString(strBuffer)) {
                break;
            }
        }
        return strBuffer.toString();
    }

    private static Boolean checkEachString(StringBuffer strBuffer) {
        for (int index = START_INDEX; index < strBuffer.length(); index++) {
            if (index != START_INDEX && strBuffer.charAt(index - 1) == strBuffer.charAt(index)) {
                strBuffer.deleteCharAt(index - 1); strBuffer.deleteCharAt(index - 1);
                return CONTINUE;
            }
        }
        return BREAK;
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
