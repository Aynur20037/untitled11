package Test1;

public class Test {
    public static void main(String[] args) {
        Area circle = new Circle(0.6);
        Area cube = new Cube(3.8);
        System.out.println(" Площадь круга : " + circle.area());
        System.out.println(" Площадь куба : " + cube.area());
    }
}
