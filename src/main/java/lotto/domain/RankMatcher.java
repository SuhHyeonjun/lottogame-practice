package lotto.domain;

import java.util.List;

public class RankMatcher {

    public static int countMatchNumbers(List<List<Integer>> lottos, List<Integer> winningNumbers) {
        int matchCount = 0;
        int maxCount = 0;
        for (List<Integer> lotto : lottos) {
            for (Integer match : winningNumbers) {
                if (lotto.contains(match)) {
                    matchCount++;
                }
            }
            maxCount = Math.max(matchCount, maxCount);
            System.out.println(maxCount);
            matchCount = 0;
        }
        return maxCount;
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
