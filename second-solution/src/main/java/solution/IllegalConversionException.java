package solution;

public class IllegalConversionException extends RuntimeException {
    IllegalConversionException(String message) {
        super(message);
    }

    public static IllegalConversionException make(Unit unit, Unit otherUnit) {
        String message =
                String.format("Cannot convert %s, a measure of %s, to %s, a measure of, %s",
                        unit,
                        unit.getQuantity(),
                        otherUnit,
                        otherUnit.getQuantity());

        return new IllegalConversionException(message);
    }
}
