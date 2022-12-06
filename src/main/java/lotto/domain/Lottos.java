package lotto.domain;

import static lotto.domain.Lotto.makeLotto;

import java.util.ArrayList;
import java.util.List;

public class Lottos {

    public static List<List<Integer>> makeLottos(int lottoAmount) {
        List<List<Integer>> lottos = new ArrayList<>();
        for (int i = 0; i < lottoAmount; i++) {
            List<Integer> numbers = makeLotto();
            lottos.add(numbers);
        }
        return lottos;
    }
}
