package onboarding;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.max;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        String pobiFirstPage = String.valueOf(pobi.get(0));
        String pobiSecondPage = String.valueOf(pobi.get(1));
        String crongFirstPage = String.valueOf(crong.get(0));
        String crongSecondPage = String.valueOf(crong.get(1));

        Integer x = exceptHandle(pobiFirstPage, pobiSecondPage, crongFirstPage, crongSecondPage);
        if (x != null) return x;

        List pobiNumList = new ArrayList();
        List crongNumList = new ArrayList();

        pobiNumList.add(getPageSum(pobiFirstPage));
        pobiNumList.add(getPageMulti(pobiFirstPage));
        pobiNumList.add(getPageSum(pobiSecondPage));
        pobiNumList.add(getPageMulti(pobiSecondPage));
        int pobiMaxPage = (int) max(pobiNumList);

        crongNumList.add(getPageSum(crongFirstPage));
        crongNumList.add(getPageMulti(crongFirstPage));
        crongNumList.add(getPageSum(crongSecondPage));
        crongNumList.add(getPageMulti(crongSecondPage));
        int crongMaxPage = (int)max(crongNumList);

        answer = getAnswer(pobiMaxPage, crongMaxPage);
        return answer;
    }

    private static Integer exceptHandle(String pobiFirstPage, String pobiSecondPage, String crongFirstPage, String crongSecondPage) {
        int answer;
        if (pobiFirstPage.equals(0) || pobiSecondPage.equals(0) || crongFirstPage.equals(0) || crongSecondPage.equals(0)){
            answer = -1;
            return 0;
        }
        return null;
    }

    private static int getAnswer(int pobiMaxPage, int crongMaxPage) {
        int result = 2;
        if (pobiMaxPage > crongMaxPage){
            result = 1;
        }else if (pobiMaxPage == crongMaxPage){
            result = 0;
        }
        return result;
    }

    public static int getPageSum(String page){
        int sum = 0;
        for(int i = 0; i < page.length(); i++){
            sum += (int)page.charAt(i) + '0';
        }
        return sum;
    }
    
    public static int getPageMulti(String page){
        int multi = 1;
        for(int i = 0; i < page.length(); i++){
            multi *= (int)page.charAt(i) + '0';
        }
        return multi;
    }
}