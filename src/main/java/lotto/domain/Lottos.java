package lotto.domain;

import static lotto.domain.Lotto.makeLotto;

import java.util.ArrayList;
import java.util.List;
import lotto.view.OutputView;

public class Lottos {

    public static List<List<Integer>> makeLottos(int lottoAmount) {
        List<List<Integer>> lottos = new ArrayList<>();
        for (int i = 0; i < lottoAmount; i++) {
            List<Integer> numbers = makeLotto();
            lottos.add(numbers);
            OutputView.printLottos(new Lotto(numbers));
        }
        return lottos;
    }
}
