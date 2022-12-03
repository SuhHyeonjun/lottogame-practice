package lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RankMatcher {
    private static int matchCount = 0;

    public static List<Integer> getMostMatchLotto(List<List<Integer>> lottos, List<Integer> winningNumbers) {
        int count = 0;
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (List<Integer> lotto : lottos) {
            for (Integer match : winningNumbers) {
                if (lotto.contains(match)) {
                    count++;
                    map.put(lotto, count);
                }
            }
            System.out.println(map);
            count = 0;
        }
        count = Collections.max(map.values());
        matchCount = count;
        List<Integer> mostMatchLotto = new ArrayList<>();
        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(matchCount)) {
                mostMatchLotto = entry.getKey();
                break;
            }
        }
        System.out.println(mostMatchLotto);
        return mostMatchLotto;
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
