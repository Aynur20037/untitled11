package Test1;

public class Cube extends Area {
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return 6 * Math.pow(a, 6);
    }
}
