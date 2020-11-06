package e42;

public class Motorcycle extends Vehicle {
    public Motorcycle(Owner owner, String licensePlate) {
        super(owner, licensePlate);
    }

    @Override
    public int inspectionFees() {
        return 25;
    }
}
