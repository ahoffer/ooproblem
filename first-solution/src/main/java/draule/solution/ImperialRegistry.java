package draule.solution;

import draule.Unit;

import java.util.HashMap;
import java.util.Map;

public class ImperialRegistry {

    final static Map<Unit, Amount> conversions = new HashMap<>();

    static {
        conversions.put(Unit.OKRA, new Amount(2.8, Unit.POUND));
        conversions.put(Unit.STONE, new Amount(14, Unit.POUND));
    }

    public static Amount convert(Amount input, Unit otherUnit) {

        Amount inputAsImperial = conversions.get(input.getUnit());
        Amount outputAsImperial = conversions.get(otherUnit);
        double imperialValueOfOutput =
                input.getValue() * inputAsImperial.getValue() / outputAsImperial.getValue();
        return new Amount(imperialValueOfOutput, otherUnit);
    }
}
