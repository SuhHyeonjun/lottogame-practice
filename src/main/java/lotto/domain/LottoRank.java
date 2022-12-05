package lotto.domain;

public enum LottoRank {
    NONE_MATCH(0, "당첨번호가 없습니다.", 0),
    THREE_MATCHES(3, "3개 일치 (5,000원) - ", 5_000),
    FOUR_MATCHES(4, "4개 일치 (50,000원) - ", 50_000),
    FIVE_MATCHES(5, "5개 일치 (1,500,000원) - ", 1_500_000),
    FIVE_AND_BONUS_MATCHES(5, "5개 일치, 보너스 볼 일치 (30,000,000원) - ", 30_000_000),
    ALL_MATCHES(6, "6개 일치 (2,000,000,000원) - ", 2_000_000_000);

    private final int match;
    private final String rank;
    private final int money;

    LottoRank(int match, String rank, int money) {
        this.match = match;
        this.rank = rank;
        this.money = money;
    }

    public static LottoRank getRankResult(int matchCount, boolean bonus) {
        if (FIVE_AND_BONUS_MATCHES.match == matchCount && bonus) {
            return FIVE_AND_BONUS_MATCHES;
        }
        for (LottoRank rank : values()) {
            if (rank.match == matchCount && rank != FIVE_AND_BONUS_MATCHES) {
                return rank;
            }
        }
        return NONE_MATCH;
    }

    public String getRank() {
        return rank;
    }

    public int getMoney() {
        return money;
    }
}
