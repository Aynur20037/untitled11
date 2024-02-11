package Test5;

public class SalariedEmployee extends Employee {
    private int salaryForMonth;

    public SalariedEmployee(int salaryForMonth) {
        this.salaryForMonth = salaryForMonth;
    }

    @Override
    public double salary() {
        return salaryForMonth;
    }
}
