package e37;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Enterprise {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int calculatePayroll() {
        int monthlyPayroll = 0;
        for (Employee e : employees)
            monthlyPayroll += e.getPay();
        return monthlyPayroll;
    }

    public String printPayroll() {
        StringBuilder payroll = new StringBuilder("");
        for (Employee e : employees)
            payroll.append(e.getName()).append(" - ").append(e.getPay()).append("\n");
        //                  |                                 | => Dynamic binding
        return new String(payroll);
    }

    public static void main(String[] args) {
        SalariedEmployee js = new SalariedEmployee("John Smith", LocalDate.of(2020, 9, 27), 12000);
        HourlyEmployee pp = new HourlyEmployee("Peter Parker", LocalDate.of(2020, 8, 28), 10, 100);
        HourlyEmployee tc = new HourlyEmployee("Tom Cooper", LocalDate.of(2010, 1, 13), 10, 100);

        Enterprise fooBar = new Enterprise();
        fooBar.addEmployee(js);
        fooBar.addEmployee(pp); // polymorphism
        fooBar.addEmployee(tc);

        System.out.println("Monthly payroll = " + fooBar.calculatePayroll());
        System.out.println("Payroll");
        System.out.println(fooBar.printPayroll());
    }
}
