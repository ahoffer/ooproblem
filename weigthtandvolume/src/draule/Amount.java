package draule;

public class Amount {

    private Unit unit;

    private double value;

    public Amount(double value, Unit unit) {
        this.unit = unit;
        this.value = value;
    }

    public Amount convertTo(Unit otherUnit) {
        return ImperialRegistry.convert(this, otherUnit);
    }

    public Unit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }
}
