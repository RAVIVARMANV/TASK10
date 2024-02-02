package task10;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0 ; 
    }

    public Circle(double radius) {
    	
        this.radius = radius;
    }

    public double Circumference() {
        return 2 * Math.PI * radius;
    }
}
