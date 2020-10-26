package e34;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private int salary; // annual

    public SalariedEmployee(String name, LocalDate hireDate, int salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    public int getPay() {
        return salary / 12;
    }

    @Override
    public String getName() {
        return super.getName() + " - salaried";
    }
}
