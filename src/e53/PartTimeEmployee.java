package e53;

import java.time.LocalDate;

public class PartTimeEmployee extends Employee {
    private int salary; // annual
    private int percentage; // percentage of total time worked

    public PartTimeEmployee(String name, LocalDate hireDate, int salary, int percentage) {
        super(name, hireDate);
        this.salary = salary;
        this.percentage = percentage;
    }

    public int getPay() {
        return ((salary * percentage) / 100) / 12 ;
    }

    @Override
    public String getName() {
        return super.getName() + " - part time";
    }
}
