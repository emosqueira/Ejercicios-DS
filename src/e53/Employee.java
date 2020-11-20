package e53;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private LocalDate hireDate;

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
//            for(int i = 0; i < others.length; i++)
//                if (this.getPay() != others[i].getPay())
//                    return false;
            for (Employee other : others)
                if (this.getPay() != other.getPay())
                    return false;
        return true;
    }
}
