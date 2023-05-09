package onboarding;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Problem2Test {

    @Test
    void decodeTest() {
        String cryptogram1 = "browoanoommnaon";
        String cryptogram2 = "zyelleyz";

        Problem2 test1 = new Problem2();
        Problem2 test2 = new Problem2();

        String result1 = test1.solution(cryptogram1);
        String result2 = test2.solution(cryptogram2);


        String expected1 = "brown";
        String expected2 = "";

        assertThat(result1).isEqualTo(expected1);
        assertThat(result2).isEqualTo(expected2);
    }

    @Test
    void upperCaseWordTest() {
        String upperCryptogram = "Bbnaeds";

        Problem2 test = new Problem2();
        String result = test.solution(upperCryptogram);

        String expected = "not lowercase word Exception";

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void outOfRangeLengthTest() {
        String shortCryptogram = "";
        String longCryptogram = "a".repeat(1001);

        Problem2 test1 = new Problem2();
        Problem2 test2 = new Problem2();
        String result1 = test1.solution(shortCryptogram);
        String result2 = test2.solution(longCryptogram);

        String expected = "not correct range of length Exception";

        assertThat(result1).isEqualTo(expected);
        assertThat(result2).isEqualTo(expected);
    }

}