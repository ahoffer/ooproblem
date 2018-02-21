package draule;

public class Amount implements AmountInterface {

    public Amount(double value, Unit unit) {

    }

    @Override
    public AmountInterface convertTo(Unit otherUnit) {
        return null;
    }

    @Override
    public Unit getUnit() {
        return null;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
