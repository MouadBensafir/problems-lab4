package problem6;

public class Circle extends Forme {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getSurface() {
        return Math.round(radius*radius*Math.PI*100) * 0.01;
    }

    @Override
    public String toString() {
        return String.format("Circle (radius %.1f cm)", this.radius);
    }
}
