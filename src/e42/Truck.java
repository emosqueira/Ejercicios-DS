package e42;

public class Truck extends Vehicle {
    public Truck(Owner owner, String licensePlate) {
        super(owner, licensePlate);
    }

    @Override
    public int inspectionFees() {
        return 100;
    }
}
