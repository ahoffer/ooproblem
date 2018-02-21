package draule.solution;


import draule.AmountInterface;
import draule.Unit;

public class Amount implements AmountInterface {

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
