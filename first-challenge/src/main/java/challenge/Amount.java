package challenge;

public interface Amount {

    Amount convertTo(Unit otherUnit);

    Unit getUnit();

    double getValue();
}
