package onboarding;

public class Problem3 {

    public static Game game;

    public static int solution(int number) {
        try {
            game.setGame(number);
            int answer = game.playGame(number);
            return answer;
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    static class Game {

        static final int min = 1;
        static final int max = 10000;

        static private int lastNumber;

        private Game(int lastNumber) {
        }

        private static Game setGame(int lastNumber) {  //왜 static 붙이니까 nullPointerException발생 안 하는거지??????????
            isValidNumber(lastNumber);
            return new Game(lastNumber);
        }

        private static void isValidNumber(int lastNumber) {
            if (lastNumber < min || lastNumber > max)
                throw new IllegalArgumentException();
        }


        private static int checkEachNumber(int number) {
            int count = 0;
            while(number != 0) {
                int digit = number % 10;
                if(digit != 0 && digit % 3 == 0) count++;
                number /= 10;
            }
            return count;
        }

        private static int playGame(int lastNumber) {
            int count = 0;
            for (int i = 1; i <= lastNumber; i++) count += checkEachNumber(i);
            return count;
        }

    }
}
