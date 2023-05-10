package onboarding;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Problem6Test {

    @Test
    void testcheckNickname() {
        List<String> expected = Arrays.asList("jason@email.com", "jm@email.com", "mj@email.com");
        List<List<String>> test = new ArrayList<List<String>>();
        test.add(Arrays.asList("jm@email.com", "제이엠"));
        test.add(Arrays.asList("jason@email.com", "제이슨"));
        test.add(Arrays.asList("woniee@email.com", "워니"));
        test.add(Arrays.asList("mj@email.com", "엠제이"));
        test.add(Arrays.asList("nowm@email.com", "이제엠"));

        Problem6 problem6 = new Problem6();
        List<String> result = problem6.solution(test);

        assertThat(result).isEqualTo(expected);
    }

}