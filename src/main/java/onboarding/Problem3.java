package onboarding;

public class Problem3 {

    public static final String NUMBER_RANGE_ONE_TO_THOUSAND = "숫자의 범위는 1부터 10000 이하입니다.";
    public static final char TREE = '3';
    public static final char SIX = '6';
    public static final char NINE = '9';
    public static int solution(int number) {
        validateNumberRange(number);
        return getCount(number);
    }

    private static void validateNumberRange(int number) {
        if (number < 1 || number > 10000){
            throw new IllegalArgumentException(NUMBER_RANGE_ONE_TO_THOUSAND);
        }
    }

    public static int getCount(int number){
        int count = 0;
        for (int i = 1; i <= number; i++){
            String num = String.valueOf(i);
            count = upCount(count, num);
        }
        return count;
    }

    private static int upCount(int count, String num) {
        for (int j = 0; j < num.length(); j++){
            if (isInclude369(num, j)){
                count++;
            }
        }
        return count;
    }

    private static boolean isInclude369(String num, int j) {
        return num.charAt(j) == TREE || num.charAt(j) == SIX || num.charAt(j) == NINE;
    }
}
