package challenge;

public class IllegalConversion extends RuntimeException {
    IllegalConversion(String message) {
        super(message);
    }

    public static IllegalConversion make(Unit unit, Unit otherUnit) {
        String message =
                String.format("Cannot convert %s, a measure of %s, to %s, a measure of, %s",
                        unit,
                        unit.getQuantity(),
                        otherUnit,
                        otherUnit.getQuantity());

        return new IllegalConversion(message);
    }
}
