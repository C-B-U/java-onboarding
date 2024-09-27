package onboarding.problem2;

public final class CrypErrorHandler {

    public final static String CRYP_LENGTH_IS_ONE_TO_HUND= "1이상 1000이하인 문자열이어야합니다.";
    public final static String CRYP_COMPOSE_BY_SMALL_LETTER = "cryptogram은 소문자로만 이루어져 있습니다.";
    private static void validateCrypLength(String cryptogram) {
        if (cryptogram.length() < 1 || cryptogram.length() > 1000){
            throw new IllegalArgumentException(CRYP_LENGTH_IS_ONE_TO_HUND);
        }
    }

    private static void validateCrypSmallLetter(String cryptogram) {
        for (char word : cryptogram.toCharArray()){
            if (!Character.isLowerCase(word)){
                throw new IllegalArgumentException(CRYP_COMPOSE_BY_SMALL_LETTER);
            }
        }
    }

    public static void checkCryptogram(String cryptogram){
        validateCrypLength(cryptogram);
        validateCrypSmallLetter(cryptogram);
    }

}
