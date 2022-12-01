package lotto;

import static camp.nextstep.edu.missionutils.Console.readLine;

import lotto.validator.CommonInputValidator;
import lotto.validator.InputPriceValidator;

public class InputView {

    public static int inputPurchasePrice() {
        System.out.println(Message.INPUT_PURCHASE_PRICE.getMessage());
        String inputPrice = readLine();
        CommonInputValidator.validateCommonInput(inputPrice);
        int purchasePrice = Integer.parseInt(inputPrice);
        InputPriceValidator.validatePurchasePrice(purchasePrice);
        InputPriceValidator.validateZero(purchasePrice);
        return purchasePrice;
    }
}
