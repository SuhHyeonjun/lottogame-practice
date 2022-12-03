package lotto.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.List;
import lotto.domain.TypeChanger;
import lotto.validator.CommonInputValidator;
import lotto.validator.InputBonusValidator;
import lotto.validator.InputPriceValidator;
import lotto.validator.InputWinningValidator;

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

    public static List<Integer> inputWinningNumber() {
        System.out.println(Message.INPUT_WINNING_NUMBER.getMessage());
        String inputWinning = readLine();
        InputWinningValidator.validateInputWinningString(inputWinning);
        List<Integer> winningNumbers = TypeChanger.changeToList(inputWinning);
        InputWinningValidator.validateWinningNumber(winningNumbers);
        return winningNumbers;
    }

    public static int inputBonusNumber() {
        System.out.println(Message.INPUT_BONUS_NUMBER.getMessage());
        String inputBonus = readLine();
        CommonInputValidator.validateCommonInput(inputBonus);
        InputBonusValidator.validateBonusNumber(inputBonus);
        int bonusNumber = Integer.parseInt(inputBonus);
        return bonusNumber;
    }
}
