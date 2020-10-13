package e32;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private int wageRate; // per hour
    private int hours; // for the month

    public HourlyEmployee(String name, LocalDate hireDate, int wageRate, int hours) {
        super(name, hireDate);
        this.wageRate = wageRate;
        this.hours = hours;
    }

    public int getPay() {
        return wageRate * hours;
    }
}
