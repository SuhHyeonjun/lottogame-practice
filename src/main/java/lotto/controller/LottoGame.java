package lotto.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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
        int matchCount = RankMatcher.countMatchNumbers(lottos, winningNumbers);
        System.out.println(matchCount);
    }

    private static void checkOverlap(List<Integer> winningNumbers, int bonusNumber) {
        if (winningNumbers.contains(bonusNumber)) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_OVERLAP.getErrorMessage());
        }
    }

    private static void printResult(int matchCount) {

    }


}
