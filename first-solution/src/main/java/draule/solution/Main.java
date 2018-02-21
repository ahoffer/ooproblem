package draule.solution;

import draule.Unit;

public class Main {

    /**
     * A flour merchant from Tupra wants to buy 27 stones of flour from Yubian traders.
     * How many okras of flour does she need to buy fill her order?
     *
     * @param args
     */
    public static void main(String[] args) {

        Amount tupranAmount = new Amount(27, Unit.STONE);
        Amount yubianAmount = tupranAmount.convertTo(Unit.OKRA);
        boolean doesItWork = tupranAmount.getValue() == yubianAmount.convertTo(Unit.STONE)
                .getValue();
    }
}
