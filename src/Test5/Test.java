package Test5;

public class Test {
    public static void main(String[] args) {
        Employee hourlyEmployee = new HourlyEmployee(17000.5,16);
        Employee salariedEmployee = new SalariedEmployee(1000000);
        System.out.println( " Hourly Employee Salary:  " + hourlyEmployee.salary() + " tenge");
        System.out.println( " Salaried Employee Salary:  " + salariedEmployee.salary() + " tenge");
    }
}
