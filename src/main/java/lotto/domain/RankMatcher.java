package lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RankMatcher {
    private static int matchCount = 0;
    private static int count;

    public static List<Integer> getMostMatchLotto(List<List<Integer>> lottos, List<Integer> winningNumbers) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (List<Integer> lotto : lottos) {
            count(map, lotto, winningNumbers);
            count = 0;
        }
        setMatchCount(map);
        List<Integer> mostMatchLotto = new ArrayList<>();
        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(matchCount)) {
                mostMatchLotto = entry.getKey();
                break;
            }
        }
        return mostMatchLotto;
    }

    private static void setMatchCount(Map<List<Integer>, Integer> map) {
        count = Collections.max(map.values());
        matchCount = count;
    }

    private static void count(Map<List<Integer>, Integer> map, List<Integer> lotto, List<Integer> winningNumbers) {
        for (Integer match : winningNumbers) {
            if (lotto.contains(match)) {
                count++;
                map.put(lotto, count);
            }
        }
    }

    public static boolean matchBonus(List<Integer> mostMatchLotto, int bonusNumber) {
        if (mostMatchLotto.contains(bonusNumber)) {
            return true;
        }
        return false;
    }

    public static int getMatchCount() {
        return matchCount;
    }
}
