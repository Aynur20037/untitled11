package Test5;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hours;

    public HourlyEmployee(double hourlyRate, int hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public double salary() {
        return hours * hourlyRate;

    }
}
