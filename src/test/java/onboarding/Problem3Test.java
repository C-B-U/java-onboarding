package onboarding;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Problem3Test {

    @Test
    void playGameTest() {
        int number1 = 13;
        int number2 = 33;

        Problem3 test1 = new Problem3();
        Problem3 test2 = new Problem3();

        int result1 = test1.solution(number1);
        int result2 = test2.solution(number2);

        assertThat(result1).isEqualTo(4);
        assertThat(result2).isEqualTo(14);
    }

    @Test
    void outOfRangeNumberTest() {
        int maxNumber = 10001;
        int minNumber = 0;

        Problem3 test1 = new Problem3();
        Problem3 test2 = new Problem3();

        int result1 = test1.solution(maxNumber);
        int result2 = test2.solution(minNumber);

        assertThat(result1).isEqualTo(-1);
        assertThat(result2).isEqualTo(-1);
    }

}