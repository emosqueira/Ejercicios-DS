package e53;

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
            payroll.append(e.getName()).append(" - ").append(e.getPay()).append("\n"); // Dynamic binding
        return new String(payroll);
    }

    public static void main(String[] args) {
        var se = new SalariedEmployee("John", LocalDate.now(), 12000);
        var he = new HourlyEmployee("Peter", LocalDate.now(), 110, 10);
        var pte = new PartTimeEmployee("James", LocalDate.now(), 12000, 50);

        Enterprise e = new Enterprise();
        e.addEmployee(se);
        e.addEmployee(he);
        e.addEmployee(pte);
        System.out.println(e.printPayroll());
    }
}
