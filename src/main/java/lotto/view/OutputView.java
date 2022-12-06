package lotto.view;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import lotto.domain.LottoRank;

public class OutputView {

    public static void printLottos(List<List<Integer>> lottos) {
        for (List<Integer> lotto : lottos) {
            System.out.println(lotto);
        }
        System.out.println();
    }

    public static void printAmount(int lottoAmount) {
        System.out.println(lottoAmount + Message.PURCHASE_AMOUNT.getMessage());
    }

    public static void printWinningLists(Map<LottoRank, Integer> result) {
        System.out.println(Message.RESULT.getMessage());
        for (LottoRank rank : LottoRank.values()) {
            if (rank.getMoney() == 0) {
                continue;
            }
            System.out.println(rank.getRank() + result.get(rank) + "개");
        }
    }

    public static void printRate(Map<LottoRank, Integer> result, int purchasePrice) {
        for (LottoRank count : result.keySet()) {
            if (result.get(count) == 1) {
                Double rate = ((double) count.getMoney() / purchasePrice) * 100;
                DecimalFormat format = new DecimalFormat("###,###.#");
                System.out.println(Message.TOTAL_RATE.getMessage() + format.format(rate) + Message.PERCENT.getMessage());
            }
        }
    }
}
