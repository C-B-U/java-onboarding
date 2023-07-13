package onboarding;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        Deque<Character> cryptogramStack = convertStringToStack(cryptogram);
        Deque<Character> resultStack = removeDuplicateChar(cryptogramStack);
        return answer;
    }

    private static Deque<Character> convertStringToStack(String cryptogram){
        Deque<Character> stack = new ArrayDeque<Character>();
        for (char word : cryptogram.toCharArray()){
            stack.add(word);
        }
        return stack;
    }

    private static Deque<Character> removeDuplicateChar(Deque<Character> cryptogram) {
        Deque<Character> resultStack = new ArrayDeque<Character>();
        while (!cryptogram.isEmpty()){
               Character word = cryptogram.removeLast();
                // 결과 stack이 비어있지 않고 cryptogram의 마지막 요소와 word가 같으면(중복) 마지막 요소 제가
               if (!resultStack.isEmpty() && Objects.equals(word, resultStack.peekLast())){
                   resultStack.removeLast();
                   continue;
               }
               resultStack.addLast(word);

        }
        return resultStack;
    }

}
