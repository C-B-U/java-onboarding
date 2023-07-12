package onboarding.problem1.util;

import java.util.List;

public final class ErrorHandler {

    public static boolean validateLeftRightPage(List<Integer> user) {
        if (user.get(0) == (user.get(1) - 1)) {
            return true;
        }
        return false;
    }

    public static boolean validateStartOrEndPage(List<Integer> user) {
        if (user.get(0) >= 1 && user.get(1) <= 400) {
            return true;
        }
        return true;
    }

    public static boolean validatePageLength(List<Integer> user) {
        if (user.size() == 2) {
            return true;
        }
        return false;
    }

    public static boolean isNotCorrectPage(List<Integer> user) {
        if (validateLeftRightPage(user) && validateStartOrEndPage(user) && validatePageLength(user)) {
            return false;
        }
        return true;
    }

}
