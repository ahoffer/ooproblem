package draule;

public interface AmountInterface {

    AmountInterface convertTo(Unit otherUnit);

    Unit getUnit();

    double getValue();
}
