package lotto;

import lotto.controller.LottoGame;

public class Application {
    public static void main(String[] args) {
        try {
            LottoGame lottoGame = new LottoGame();
            lottoGame.start();
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
