package e42;

public class InspectionReport {
    private final Vehicle vehicle;
    private final int year;

    public InspectionReport(Vehicle vehicle, int year) {
        this.vehicle = vehicle;
        this.year = year;
    }

    public String invoice() {
        return vehicle.getOwner().getName() + " - " + vehicle.getLicensePlate() + " - " + vehicle.inspectionFees() + " EUR";
    }
}