package lotto.domain;

import static lotto.domain.Lotto.makeLotto;

import lotto.view.OutputView;

public class Lottos {
    private static final int DIVIDE = 1000;

    public static void makeLottos(int purchasePrice) {
        for (int i = 0; i < purchasePrice/DIVIDE; i++) {
            OutputView.printLottos(new Lotto(makeLotto()));
        }
    }
}
