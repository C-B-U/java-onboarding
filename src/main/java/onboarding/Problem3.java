package onboarding;

public class Problem3 {

    public static final int MAXIMUM_NUMBER = 10000;
    public static final int MINIMUM_NUMBER = 1;
    public static final char TRHEE = '3';
    public static final char SIX = '6';
    public static final char NINE = '9';

    public static int solution(int number) {
        if(!checkValidationOfNumber(number)) {
            throw new IllegalArgumentException("number의 값이 잘못 되었습니다.");
        }
        int answer = getResult(number+1);
        return answer;
    }
    private static boolean checkValidationOfNumber(int number) {
        if(number < MINIMUM_NUMBER || number > MAXIMUM_NUMBER) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}
