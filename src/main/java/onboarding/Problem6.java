package onboarding;

import java.util.*;

public class Problem6 {

    public static Crew crew;

    public static List<String> solution(List<List<String>> forms) {
        try {
            crew.setCrew(forms);
            List<String> answer = crew.checkNickname(forms);
            Collections.sort(answer);
            return answer;
        } catch (IllegalArgumentException e) {
            return Collections.emptyList();
        }
    }

    static class Crew {
        static final int minCrewNumber = 1;
        static final int maxCrewNumber = 10000;

        static final int minEmailLength = 11;
        static final int maxEmailLength = 19;
        static final String emailDomain = "email.com";
        static final int emailIndex = 1;
        static final int nicknameIndex = 0;


        private Crew(List<List<String>> forms) {

        }

        private static Crew setCrew(List<List<String>> forms) {
            checkCorrectCrew(forms);
            return new Crew(forms);
        }

        private static void checkCorrectCrew(List<List<String>> forms) {
            isValidPersonnel(forms.size());
            isValidEmailLength(forms);
            isValidNickname(forms);
        }


        private static void isValidPersonnel(int personnel) {
            if(personnel < minCrewNumber || personnel > maxCrewNumber)
                throw new IllegalArgumentException();
        }

        private static void isValidEmailLength(List<List<String>> forms) {
            for(List<String> form : forms) {
                int len = form.get(emailIndex).length();
                if (len < minEmailLength || len > maxEmailLength)
                    throw new IllegalArgumentException();
                if (!form.get(emailIndex).substring(len - emailDomain.length()).equals(emailDomain))
                    throw new IllegalArgumentException();
            }
        }

        private static void isValidNickname(List<List<String>> forms) {
            for(List<String> form : forms)
                isHangul(form.get(nicknameIndex).toCharArray());
        }


        private static boolean isHangul(char[] nicknames) {
            for (char n : nicknames) {
                if(n < '\uAC00' && n > '\uD7A3')
                    return false;

            }
            return true;
        }


        private static ArrayList<String> checkNickname(List<List<String>> forms) {
            List<String> nicknames = new ArrayList<String>();
            HashSet<String> result = new HashSet<>();
            for(List<String> form : forms) nicknames.add(form.get(nicknameIndex));
            //3중 for문.....
            for (int i = 0; i < nicknames.size(); i++) {
                for(int j = 1; j < nicknames.get(i).length(); j++) {
                    String test = nicknames.get(i).substring(j - 1, j);
                    for(int k = i; k < nicknames.size(); k++) {
                        if(nicknames.get(k).contains(test)){
                            result.add(forms.get(i).get(emailIndex));
                            result.add(forms.get(k).get(emailIndex));
                        }
                    }
                }
            }
            return new ArrayList<>(result);
        }
    }
}
