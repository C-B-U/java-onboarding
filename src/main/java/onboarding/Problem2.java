package onboarding;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

import static onboarding.problem2.CrypErrorHandler.checkCryptogram;

public class Problem2 {
    public static String solution(String cryptogram) {

        checkCryptogram(cryptogram);
        Deque<Character> cryptogramStack = convertStringToStack(cryptogram);
        Deque<Character> resultStack = removeDuplicateChar(cryptogramStack);

        return resultPassword(resultStack);
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
               Character word = cryptogram.removeFirst();
               if (isDuplicate(resultStack, word)){
                   resultStack.removeLast();
                   continue;
               }
               resultStack.addLast(word);
        }
        return resultStack;
    }

    private static String resultPassword(Deque<Character> resultStack) {
        StringBuilder password = new StringBuilder();
        while (!resultStack.isEmpty()){
            password.append(resultStack.removeFirst());
        }
        return password.toString();
    }

    private static boolean isDuplicate(Deque<Character> resultStack, Character word) {
        return !resultStack.isEmpty() && Objects.equals(word, resultStack.peekLast());
    }
}
