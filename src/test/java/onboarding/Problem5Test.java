package onboarding;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void testCommonWithdarw() {
        int money1 = 50237;
        int money2 = 15000;

        Problem5 test1 = new Problem5();
        Problem5 test2 = new Problem5();
        List<Integer> result1 = test1.solution(money1);
        List<Integer> result2 = test2.solution(money2);

        List<Integer> expected1 = Arrays.asList(1, 0, 0, 0, 0, 2, 0, 3, 7);
        List<Integer> expected2 = Arrays.asList(0, 1, 1, 0, 0, 0, 0, 0, 0);

        assertThat(result1).isEqualTo(expected1);
        assertThat(result2).isEqualTo(expected2);
    }

    @Test
    void testOutOfBoundsMoney() {
        int money1 = 0;
        int money2 = 1000001;
        Problem5 test1 = new Problem5();
        Problem5 test2 = new Problem5();
        List<Integer> result1 = test1.solution(money1);
        List<Integer> result2 = test2.solution(money2);

        assertThat(result1).isEqualTo(Collections.emptyList());
        assertThat(result2).isEqualTo(Collections.emptyList());

    }

}