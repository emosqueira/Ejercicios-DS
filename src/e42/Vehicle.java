package e42;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    protected final String licensePlate;
    int cubicCentimetres;
    private Owner owner;
    public List<InspectionReport> inspections = new ArrayList<>();

    public Vehicle(Owner owner, String licensePlate) {
        this.owner = owner;
        this.licensePlate = licensePlate;
    }

    public abstract int inspectionFees();

    public String getLicensePlate() {
        return licensePlate;
    }

    public Owner getOwner() {
        return owner;
    }
}
