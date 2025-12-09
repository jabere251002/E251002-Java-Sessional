abstract class Shape {
    abstract void area();

    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        c.area();
        r.area();
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    @Override
    void area() { System.out.println("Area of Circle: " + (3.1416 * radius * radius)); }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }
    @Override
    void area() { System.out.println("Area of Rectangle: " + (length * width)); }
}
