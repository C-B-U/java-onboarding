package onboarding.problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static onboarding.problem1.util.ErrorHandler.*;
import static org.assertj.core.api.Assertions.assertThat;

public class problem1Test {

    @Nested
    class ErrorHandlerTest{

        List<Integer> user = List.of(97,98);

        @Test
        void isLeftRightPage() {
            assertThat(validateLeftRightPage(user)).isEqualTo(true);
        }

        @Test
        void isStartOrEndPage() {
            assertThat(validateStartOrEndPage(user)).isEqualTo(true);
        }

        @Test
        void isPageLength(){
            assertThat(validatePageLength(user)).isEqualTo(true);
        }

        @Test
        void checkIsNotCorrectPage(){
            assertThat(isNotCorrectPage(user)).isEqualTo(false);
        }


    }
}
