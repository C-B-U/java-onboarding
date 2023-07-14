package onboarding;

public class Problem3 {

    public static final String NUMBER_RANGE_ONE_TO_THOUSAND = "숫자의 범위는 1부터 10000 이하입니다.";
    public static int solution(int number) {
        int answer = 0;
        validateNumberRange(number);
        return answer;
    }

    private static void validateNumberRange(int number) {
        if (number < 1 || number > 10000){
            throw new IllegalArgumentException(NUMBER_RANGE_ONE_TO_THOUSAND);
        }
    }
}
