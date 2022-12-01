package lotto;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class Lotto {
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 45;
    private static final int LOTTO_COUNT = 6;

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public static List<Integer> makeLotto() {
        List<Integer> lotto = Randoms.pickUniqueNumbersInRange(START_RANGE, END_RANGE, LOTTO_COUNT);
        return lotto;
    }

    @Override
    public String toString() {
        return numbers.toString();
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }
}
