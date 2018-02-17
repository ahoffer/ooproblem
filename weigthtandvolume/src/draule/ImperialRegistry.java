package draule;

import java.util.HashMap;
import java.util.Map;

public class ImperialRegistry {

    final static Map<Unit, Amount> conversions = new HashMap<>();

    static {
        conversions.put(Unit.OKRA, new Amount(2.8, Unit.POUND));
        conversions.put(Unit.STONE, new Amount(14, Unit.POUND));
        conversions.put(Unit.BARREL, new Amount(7056, Unit.CUBIC_INCH));
        conversions.put(Unit.COOMB, new Amount(8701, Unit.CUBIC_INCH));
    }

    public static Amount convert(Amount input, Unit otherUnit) {
        if (!input.getUnit()
                .compatibleQuantity(otherUnit)) {
            throw IllegalConversion.make(input.getUnit(), otherUnit);
        }

        Amount inputAsImperial = conversions.get(input.getUnit());
        Amount outputAsImperial = conversions.get(otherUnit);
        double imperialValueOfOutput =
                input.getValue() * inputAsImperial.getValue() / outputAsImperial.getValue();
        return new Amount(imperialValueOfOutput, otherUnit);
    }
}
