package onboarding;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        Deque<Character> cryptogramStack = convertStringToStack(cryptogram);

        return answer;
    }
    private static Deque<Character> convertStringToStack(String cryptogram){
        Deque<Character> stack = new ArrayDeque<Character>();
        for (char word : cryptogram.toCharArray()){
            stack.add(word);
        }
        return stack;
    }

}
