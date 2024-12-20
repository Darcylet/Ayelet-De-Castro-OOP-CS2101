public class Triangle implements Shape{
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    @Override
    public String printShapeType() {
        return "Triangle";
    }
}
