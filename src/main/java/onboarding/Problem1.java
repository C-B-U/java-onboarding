package onboarding;

import java.util.List;

class Problem1 {
    static final int exceptionResult = -1;
    static final int pobiWinResult = 1;
    static final int crongWinResult = 2;
    static final int tieResult = 0;

    public static Person pobiPages;
    public static Person crongPages;


    public static int solution(List<Integer> pobi, List<Integer> crong) {
        try {
            pobiPages.setPerson(pobi);
            crongPages.setPerson(crong);

            int pobiScore = pobiPages.setScore(pobi);
            int crongScore = crongPages.setScore(crong);

            int result = win(pobiScore, crongScore);
            return result;

        } catch (IllegalArgumentException e) {
            return exceptionResult;
        }
    }

    static int win(int pobiScore, int crongScore) {
        if(pobiScore > crongScore) return pobiWinResult;
        if(pobiScore < crongScore) return crongWinResult;
        return tieResult;
    }

    static class Person{

        static final int lastPageNumber = 400;
        static final int firstPageNumber = 1;

        static private List<Integer> person;

        private Person(List<Integer> person) {
        }

        private static Person setPerson(List<Integer> person) {
            checkPageException(person);  //person 값을 기억 못해서 자꾸 오류남
            return new Person(person);
        }

        private static void checkPageException(List<Integer> person) {
            rangeOfPage(person);
            leftAndRightPage(person);
        }

        private static void leftAndRightPage(List<Integer> person) {
            if (person.get(1) - person.get(0) != 1)
                throw new IllegalArgumentException();
        }

        private static void rangeOfPage(List<Integer> person) {
            if (person.get(1) >= lastPageNumber || person.get(0) <= firstPageNumber)
                throw new IllegalStateException();
        }


        private static int digitPlus(int page) {
            int plusRes = 0;
            while(page != 0) {
                plusRes += page % 10;
                page /= 10;
            }
            return plusRes;
        }

        private static int digitMultiply(int page) {
            int mulRes = 1;
            while(page != 0) {
                mulRes *= page % 10;
                page /= 10;
            }
            return mulRes;
        }

        private static int setScore(List<Integer> person) {
            return Math.max(digitPlus(person.get(0)), digitMultiply(person.get(1)));
        }
    }

}