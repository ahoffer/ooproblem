package solution;

import challenge.Unit;

import java.util.HashMap;
import java.util.Map;

public class ImperialRegistry {

    final static Map<Unit, AmountImpl> conversions = new HashMap<>();

    static {
        conversions.put(Unit.OKRA, new AmountImpl(2.8, Unit.POUND));
        conversions.put(Unit.STONE, new AmountImpl(14, Unit.POUND));
    }

    public static AmountImpl convert(AmountImpl input, Unit otherUnit) {

        AmountImpl inputAsImperial = conversions.get(input.getUnit());
        AmountImpl outputAsImperial = conversions.get(otherUnit);
        double imperialValueOfOutput =
                input.getValue() * inputAsImperial.getValue() / outputAsImperial.getValue();
        return new AmountImpl(imperialValueOfOutput, otherUnit);
    }
}
