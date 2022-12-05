package lotto.controller;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
        int lottoAmount = purchasePrice / DIVIDE;
        System.out.println();
        OutputView.printAmount(lottoAmount);
        List<List<Integer>> lottos = Lottos.makeLottos(lottoAmount);
        System.out.println(lottos);
        List<Integer> winningNumbers = InputView.inputWinningNumber();
        int bonusNumber = InputView.inputBonusNumber();
        checkOverlap(winningNumbers, bonusNumber);
        List<Integer> mostMatchLotto = RankMatcher.getMostMatchLotto(lottos, winningNumbers);
        int matchCount = RankMatcher.getMatchCount();
        System.out.println(matchCount);
        boolean bonus = RankMatcher.matchBonus(mostMatchLotto, bonusNumber);
        System.out.println(bonus);
        Map<LottoRank, Integer> result = setMatchRank(matchCount, bonus);
        OutputView.printWinningLists(result);
    }

    public static Map<LottoRank, Integer> setMatchRank(int matchCount, boolean bonus) {
        Map<LottoRank, Integer> result = setRankResult();
        LottoRank rank = LottoRank.getRankResult(matchCount, bonus);
        result.put(rank, result.get(rank) + 1);
        return result;
    }

    private static Map<LottoRank, Integer> setRankResult() {
        Map<LottoRank, Integer> result = new LinkedHashMap<>();
        for (LottoRank rank : LottoRank.values()) {
            result.put(rank, 0);
        }
        return result;
    }

    private static void checkOverlap(List<Integer> winningNumbers, int bonusNumber) {
        if (winningNumbers.contains(bonusNumber)) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_OVERLAP.getErrorMessage());
        }
    }
}
