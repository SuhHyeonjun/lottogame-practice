package lotto.view;

import lotto.domain.Lotto;

public class OutputView {

    public static void printLottos(Lotto lotto) {
        System.out.println(lotto);
    }

    public static void printAmount(int lottoAmount) {
        System.out.println(lottoAmount + Message.PURCHASE_AMOUNT.getMessage());
    }
}
