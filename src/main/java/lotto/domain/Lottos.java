package lotto.domain;

import static lotto.domain.Lotto.makeLotto;

import java.util.List;
import lotto.view.OutputView;

public class Lottos {

    public static void makeLottos(int lottoAmount) {
        for (int i = 0; i < lottoAmount; i++) {
            List<Integer> numbers = makeLotto();
            OutputView.printLottos(new Lotto(numbers));
        }
    }
}
