package lotto.domain;

import java.util.List;

public class RankMatcher {

    public static int countMatchNumbers(List<List<Integer>> lottos, List<Integer> winningNumbers) {
        int matchCount = 0;
        for (List<Integer> lotto : lottos) {
            if (lotto.contains()

        }

    }

    public static boolean matchBonus(List<List<Integer>> lottos, int bonusNumber) {
        for (List<Integer> lotto : lottos) {
            if (lotto.contains(bonusNumber)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
