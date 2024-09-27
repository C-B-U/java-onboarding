package onboarding.problem1;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static onboarding.problem1.util.ErrorHandler.*;
import static onboarding.problem1.util.PageHandler.*;
import static onboarding.problem1.util.findWinner.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

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

    @Nested
    class FindWinnerTest {

        @Test
        void checkPobiWin() {
            int pobiMaxPage = 200;
            int crongMaxPage = 100;

            assertAll(
                    () -> assertThat(isPobiWin(pobiMaxPage,crongMaxPage)).isTrue(),
                    () -> assertThat(getWinner(pobiMaxPage, crongMaxPage)).isEqualTo(POBI_WIN)
            );
        }

        @Test
        void checkCrongWin() {
            int pobiMaxPage = 100;
            int crongMaxPage = 200;

            assertAll(
                    () -> assertThat(isCrongWin(pobiMaxPage,crongMaxPage)).isTrue(),
                    () -> assertThat(getWinner(pobiMaxPage, crongMaxPage)).isEqualTo(CRONG_WIN)
            );
        }

        @Test
        void checkTie() {
            int pobiMaxPage = 100;
            int crongMaxPage = 100;

            assertThat(getWinner(pobiMaxPage, crongMaxPage)).isEqualTo(NO_WINNER);
        }

    }

    @Nested
    class PageHandlerTest {


        @Test
        void checkMaxPage() {
            List<Integer> user = List.of(97, 98);

            assertAll(
                    () -> assertThat(getPageSumMax(user)).isEqualTo(17),
                    () -> assertThat(getPageMultiMax(user)).isEqualTo(72),
                    () -> assertThat(getMaxPage(getPageSumMax(user), getPageMultiMax(user))).isEqualTo(72)
            );

        }
    }
}
