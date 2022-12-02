package lotto.domain;

import static lotto.domain.Lotto.makeLotto;

import java.util.List;
import lotto.view.Message;
import lotto.view.OutputView;

public class Lottos {
    private static final int DIVIDE = 1000;

    public static void makeLottos(int purchasePrice) {
        int lottoAmount = purchasePrice / DIVIDE;
        System.out.println(lottoAmount + Message.PURCHASE_AMOUNT.getMessage());
        for (int i = 0; i < lottoAmount; i++) {
            List<Integer> numbers = makeLotto();
            OutputView.printLottos(new Lotto(numbers));
        }
    }
}
