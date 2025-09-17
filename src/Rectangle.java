public class Rectangle extends Shape {

    public double width;
    public double length;

    @Override
    public double area() {
        return length * width;
    }
}
