package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lotto.view.ErrorMessage;

public class Lotto {
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 45;
    private static final int LOTTO_COUNT = 6;

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        validateLottoDupulicate(numbers);
        validateLottoRange(numbers);
        this.numbers = numbers;
    }

    public static List<Integer> makeLotto() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(START_RANGE, END_RANGE, LOTTO_COUNT);
        sortLotto(numbers);
        return numbers;
    }

    private static void sortLotto(List<Integer> numbers) {
        Collections.sort(numbers);
    }

    public void validateLottoRange(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number < START_RANGE || number > END_RANGE) {
                throw new IllegalStateException(ErrorMessage.ERROR_LOTTO_RANGE.getErrorMessage());
            }
        }
    }

    public void validate(List<Integer> numbers) {
        if (numbers.size() != LOTTO_COUNT) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_LOTTO_SIZE.getErrorMessage());
        }
    }

    public void validateLottoDupulicate(List<Integer> numbers) {
        Set<Integer> numbersSet = new HashSet<>(numbers);
        if (numbersSet.size() != numbers.size()) {
            throw new IllegalStateException(ErrorMessage.ERROR_LOTTO_DUPLICATE.getErrorMessage());
        }
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
