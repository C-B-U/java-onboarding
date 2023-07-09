package onboarding;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem1Test {

    @Test
    void case1() {
        List<Integer> pobi = List.of(97, 98);
        List<Integer> crong = List.of(197, 198);
        int result = 0;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void case2() {
        List<Integer> pobi = List.of(131, 132);
        List<Integer> crong = List.of(211, 212);
        int result = 1;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void case3() {
        List<Integer> pobi = List.of(99, 102);
        List<Integer> crong = List.of(211, 212);
        int result = -1;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void case4() {
        List<Integer> pobi = List.of(1, 2);
        List<Integer> crong = List.of(219, 220);
        int result = 2;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void case5() {
        List<Integer> pobi = List.of(-1, 0);
        List<Integer> crong = List.of(401, 402);
        int result = -1;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void case6() {
        List<Integer> pobi = List.of(2, 3);
        List<Integer> crong = List.of(3, 4);
        int result = -1;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }
}
