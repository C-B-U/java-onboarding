package onboarding;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem4Test {

    @Test
    void testCommonTreeFrog() {
        String word = "I love you";
        Problem4 problem4 = new Problem4();
        String result = problem4.solution(word);

        String expected = "R olev blf";

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testOutOfWordLength() {
        String word1 = "R".repeat(1001);
        String word2 = "";
        Problem4 test1 = new Problem4();
        Problem4 test2 = new Problem4();
        String result1 = test1.solution(word1);
        String result2 = test2.solution(word2);
        String expected = "out of word length";

        assertThat(result1).isEqualTo(expected);
        assertThat(result2).isEqualTo(expected);

    }

}