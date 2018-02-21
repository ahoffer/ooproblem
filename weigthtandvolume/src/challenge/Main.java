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

/*
 * Tupra not only buys good from Yubia, it also sells goods to its neighbor.
 * Tupra sells wheat Yubia. The Yubians thresh the wheat, mill it, and sell back some
 * of the flour.
 *
 * Although Tuprans and Yubians both trade wheat by volume, the Tuprans sell wheat by the
 * barrel and the Yubians trade wheat by the coomb.
 *
 * The consul was please with the conversion application and wants to extend it to facilitate
 * trading wheat.
 *
 * The Imperial unit of volume is the cubic inch. According the local records:
 *
 *      A barrel holds 7,056 cubic inches
 *      A coomb holds 8,701 cubic inches
 *
 * The consul's aide is concerned about weight and volume getting confused. The solutions must
 * prevent conversions that don't make sense. For example, do not convert weights to volumes.
 *
 */

package challenge;

public class Main {

    public static void main(String[] args) {

        // A Tupran wheat monger needs to fill an order for 13 coombs of wheat.
        // How many barrels of wheat does he need to deliver to fill the order?

        Amount yubianAmount = new Amount(13, Unit.COOMB);
        Amount tupranAmount = yubianAmount.convertTo(Unit.BARREL);
        boolean didItDoAnything = yubianAmount.getValue() != tupranAmount.getValue();
        boolean doesItWork = yubianAmount.getValue() == tupranAmount.convertTo(Unit.COOMB)
                .getValue();

        // Don't allow invalid conversion
        yubianAmount.convertTo(Unit.STONE);

    }
}
