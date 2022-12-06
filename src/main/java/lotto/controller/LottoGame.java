package lotto.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import lotto.domain.LottoRank;
import lotto.domain.Lottos;
import lotto.domain.RankMatcher;
import lotto.view.ErrorMessage;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoGame {
    private static final int DIVIDE = 1000;

    public void start() {
        int purchasePrice = InputView.inputPurchasePrice();
        OutputView.printAmount(getLottoAmount(purchasePrice));
        List<List<Integer>> lottos = Lottos.makeLottos(getLottoAmount(purchasePrice));
        OutputView.printLottos(lottos);
        List<Integer> winningNumbers = InputView.inputWinningNumber();
        int bonusNumber = InputView.inputBonusNumber();
        checkOverlap(winningNumbers, bonusNumber);
        List<Integer> mostMatchLotto = RankMatcher.getMostMatchLotto(lottos, winningNumbers);
        int matchCount = RankMatcher.getMatchCount();
        boolean bonus = RankMatcher.matchBonus(mostMatchLotto, bonusNumber);
        Map<LottoRank, Integer> result = setMatchRank(matchCount, bonus);
        OutputView.printWinningLists(result);
        OutputView.printRate(result, purchasePrice);
    }

    private static Map<LottoRank, Integer> setMatchRank(int matchCount, boolean bonus) {
        Map<LottoRank, Integer> result = setResult();
        LottoRank rank = LottoRank.getRankResult(matchCount, bonus);
        result.put(rank, result.get(rank) + 1);
        return result;
    }

    private static Map<LottoRank, Integer> setResult() {
        Map<LottoRank, Integer> result = new LinkedHashMap<>();
        for (LottoRank rank : LottoRank.values()) {
            result.put(rank, 0);
        }
        return result;
    }

    private static int getLottoAmount(int purchasePrice) {
        int lottoAmount = purchasePrice / DIVIDE;
        return lottoAmount;
    }

    private static void checkOverlap(List<Integer> winningNumbers, int bonusNumber) {
        if (winningNumbers.contains(bonusNumber)) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_OVERLAP.getErrorMessage());
        }
    }
}
