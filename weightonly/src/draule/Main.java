/*
The small nations of Yubia and Tupra exist in a fictional world. The nations both share a long
border that traders and merchants cross freely. Trade between them is common. However, each nation
 measured things differently:

    - Yubians sell barrels of wheat. They sell flour by weight, in okras.
    - Tupras buy wheat by the coomb. They buy flour by weight, in stones.

Recently, both Yubia and Tupra bwere absorbed into the Draule Empire. The new Draule consul
wants to facilitate trade by making it easier to convert between different weights and measures.
The consul's aide provides you with a description of the Yubian and Tupra weights:
    - An okra is 2.8 imperial pounds
    - A stone is 14 imperial pounds
*/

package draule;

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
