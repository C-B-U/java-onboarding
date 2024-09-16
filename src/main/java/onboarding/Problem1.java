package onboarding;

import java.util.List;

class Problem1 {

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if (!(validatePage(pobi) & validatePage(crong))) {
            return -1;
        }
        int pobiScore = comparePageScore(pobi);
        int crongScore = comparePageScore(crong);
        return comparePobiAndCrong(pobiScore, crongScore);
    }

    public static int sum(int page) {
        int answer = 0;
        String pageStr = Integer.toString(page);
        for(int i = 0; i < pageStr.length(); i++) {
            answer += Integer.parseInt(pageStr.substring(i, i+1));
        }
        return answer;
    }

    public static int multi(int page) {
        int answer = 1;
        String pageStr = Integer.toString(page);
        for(int i = 0; i < pageStr.length(); i++) {
            answer *= Integer.parseInt(pageStr.substring(i, i+1));
        }
        return answer;
    }

    public static int compareSumAndMulti(int page) {
        return Math.max(sum(page), multi(page));
    }

    public static int comparePageScore(List<Integer> scores) {
        int left = compareSumAndMulti(scores.get(0));
        int right = compareSumAndMulti(scores.get(1));
        return Math.max(left, right);
    }

    public static int comparePobiAndCrong(int pobi_score, int crong_score) {
        if (pobi_score == crong_score) {
            return 0;
        }
        return calculateWinner(pobi_score, crong_score);
    }

    public static int calculateWinner(int pobi, int crong) {
        if (pobi > crong) {
            return 1;
        }
        return 2;
    }

    public static boolean validatePage(List<Integer> pages) {
        // 페이지 숫자가 연속되지 않는 경우
        if (pages.get(1) != (pages.get(0) + 1)) {
            return false;
        }
        // 페이지의 시작점이 1 미만이거나 끝페이지가 400 초과일 경우
        if (pages.get(0) < 1 || pages.get(1) > 400) {
            return false;
        }
        // 오른쪽 페이지가 짝수가 아닐 경우
        if (pages.get(1) % 2 !=0) {
            return false;
        }
        return true;
    }
}