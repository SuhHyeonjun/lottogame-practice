package lotto.view;

import java.util.LinkedHashMap;
import java.util.Map;
import lotto.domain.Lotto;
import lotto.domain.LottoRank;

public class OutputView {

    public static void printLottos(Lotto lotto) {
        System.out.println(lotto);
    }

    public static void printAmount(int lottoAmount) {
        System.out.println(lottoAmount + Message.PURCHASE_AMOUNT.getMessage());
    }

    public static void printWinningLists(Map<LottoRank, Integer> result) {
        for (LottoRank rank : LottoRank.values()) {
            if (rank.getMoney() == 0) {
                continue;
            }
            System.out.println(rank.getRank() + result.get(rank) + "개");
        }
    }
}
