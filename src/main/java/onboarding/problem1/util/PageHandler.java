package onboarding.problem1.util;

import java.util.List;
import java.util.stream.Stream;

public final class PageHandler {
    public static Stream<String> getPage(List<Integer> user) {
        return user.stream().map(Object::toString);
    }

    public static int getPageSumMax(List<Integer> user) {
        Stream<String> page = getPage(user);
        return page.mapToInt(str -> str.chars()
                        .map(Character::getNumericValue)
                        .sum())
                .max().orElseThrow(NullPointerException::new);
    }

    public static int getPageMultiMax(List<Integer> user) {
        Stream<String> page = getPage(user);
        return page.mapToInt(str -> str.chars()
                        .map(Character::getNumericValue)
                        .reduce(1, (a, b) -> a * b))
                .max().orElseThrow(NullPointerException::new);
    }

    public static int getMaxPage(int pageSumMax, int pageMultiMax) {
        return Math.max(pageSumMax, pageMultiMax);
    }
}
