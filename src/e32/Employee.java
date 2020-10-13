package e32;

import java.time.LocalDate;

public abstract class Employee {
    private final String name;
    private final LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public abstract int getPay();

    public boolean samePay(Employee other) {
        if (other == null)
            return false;
        else return (this.getPay() == other.getPay());
    }

    public static void main(String[] args) {
        SalariedEmployee se = new SalariedEmployee("John", LocalDate.now(), 12000);
        HourlyEmployee he = new HourlyEmployee("Peter", LocalDate.now(), 10, 100);

        if (se.samePay(he)) {
            System.out.println(se.getName() + "'s pay is the same as " + he.getName() + "'s");
        }
        else {
            System.out.println("Pays are not the same");
        }
    }
}
