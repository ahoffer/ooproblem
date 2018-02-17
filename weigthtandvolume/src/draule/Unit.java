package draule;

public enum Unit {

    POUND(Quantity.WEIGHT), STONE(Quantity.WEIGHT), OKRA(Quantity.WEIGHT), BARREL(Quantity.VOLUME), CUBIC_INCH(
            Quantity.VOLUME), COOMB(Quantity.VOLUME);

    private Quantity quantity;

    Unit(Quantity quantity) {
        this.quantity = quantity;
    }

    public boolean compatibleQuantity(Unit otherUnit) {
        return quantity == otherUnit.quantity;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}

