package onboarding;


import java.util.List;
import java.util.stream.Stream;

import static onboarding.problem1.util.ErrorHandler.isNotCorrectPage;
import static onboarding.problem1.util.PageHandler.*;
import static onboarding.problem1.util.findWinner.getWinner;


class Problem1 {


    public static final int isNotCorrectPage = -1;


    public static int solution(List<Integer> pobi, List<Integer> crong) {

        if (isNotCorrectPage(pobi) || isNotCorrectPage(crong)) {
            return isNotCorrectPage;
        }
        int pobiMaxPage = getMaxPage(getPageSumMax(pobi), getPageMultiMax(pobi));
        int crongMaxPage = getMaxPage(getPageSumMax(crong), getPageMultiMax(crong));

        return getWinner(pobiMaxPage, crongMaxPage);

    }
}