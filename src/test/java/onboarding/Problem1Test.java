package onboarding;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Problem1Test {

    @Test
    void equalTest() {
        List<Integer> pobi = Arrays.asList(97, 98);
        List<Integer> crong = Arrays.asList(197, 198);

        Problem1 problem1 = new Problem1();
        int result = problem1.solution(pobi, crong);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void pobiWinTest() {
        List<Integer> pobi = Arrays.asList(131, 132);
        List<Integer> crong = Arrays.asList(211, 212);

        Problem1 problem1 = new Problem1();
        int result = problem1.solution(pobi, crong);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void crongWinTest() {
        List<Integer> pobi = Arrays.asList(211, 212);
        List<Integer> crong = Arrays.asList(131, 132);

        Problem1 problem1 = new Problem1();
        int result = problem1.solution(pobi, crong);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void notLinkedPages() {
        List<Integer> pobi = Arrays.asList(99, 102);
        List<Integer> crong = Arrays.asList(211, 212);

        Problem1 problem1 = new Problem1();
        int result = problem1.solution(pobi, crong);

        assertThat(result).isEqualTo(-1);

    }

    @Test
    void outOfRangeTest() {
        List<Integer> pobi = Arrays.asList(99, 102);
        List<Integer> crong = Arrays.asList(211, 212);

        Problem1 problem1 = new Problem1();
        int result = problem1.solution(pobi, crong);

        assertThat(result).isEqualTo(-1);
    }

}