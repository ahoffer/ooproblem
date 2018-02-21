package solution;


import challenge.Amount;
import challenge.Unit;

public class AmountImpl implements Amount {

    private Unit unit;

    private double value;

    public AmountImpl(double value, Unit unit) {
        this.unit = unit;
        this.value = value;
    }

    public AmountImpl convertTo(Unit otherUnit) {
        return ImperialRegistry.convert(this, otherUnit);
    }

    public Unit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }
}
