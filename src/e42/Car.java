package e42;

public class Car extends Vehicle {
    public Car(Owner owner, String licensePlate) {
        super(owner, licensePlate);
    }

    @Override
    public int inspectionFees() {
        return 50;
    }
}
