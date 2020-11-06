package e42;

import java.util.ArrayList;
import java.util.List;

public class InspectionStation {

    private List<Owner> clients = new ArrayList<>();
    private List<InspectionReport> reports = new ArrayList<>();

    public void addClient(Owner c) {
        clients.add(c);
    }

    public void createReport(Vehicle vehicle, int year) {
        reports.add(new InspectionReport(vehicle, year));
    }

    public String printReports() {
        StringBuilder sb = new StringBuilder();
        for(InspectionReport ir : reports) {
            sb.append(ir.invoice()).append("\n");
        }
        return new String(sb);
    }

    public static void main(String[] args) {
        Person p = new Person("123456789", "John", "Smith");
        Company cp = new Company("987654321", "ACME");

        Motorcycle m = new Motorcycle(p, "1234 ABC");
        Car c = new Car(cp, "4567 XYZ");
        Truck t = new Truck(cp, "9874 JDK");

        InspectionStation is = new InspectionStation();
        is.createReport(m, 2020);
        is.createReport(c, 2020);
        is.createReport(t, 2020);

        System.out.println(is.printReports());
    }
}
