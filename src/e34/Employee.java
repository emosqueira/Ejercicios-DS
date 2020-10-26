package e34;

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

    public boolean samePay(Employee[] others) {
        if (others == null || others.length == 0)
            return false;
        else
            for (Employee other : others)
                if (this.getPay() != other.getPay())
                    return false;
        return true;
    }

    public static void main(String[] args) {
        SalariedEmployee js = new SalariedEmployee("John Smith", LocalDate.of(2020,9,27), 12000);
        HourlyEmployee pp = new HourlyEmployee("Peter Parker", LocalDate.of(2020,8,28), 10, 100);
        HourlyEmployee tc = new HourlyEmployee("Tom Cooper", LocalDate.of(2010,1,13), 10, 100);
        Employee[] employees = new Employee[2];
        employees[0] = pp;
        employees[1] = tc;

        if (js.samePay(employees)) {
            System.out.println("All have the same pay");
        }
        else {
            System.out.println("Someone have a different pay");
        }

        System.out.println("js.getName() = " + js.getName());
        System.out.println("pp.getName() = " + pp.getName());
        System.out.println("tc.getName() = " + tc.getName());
    }
}
