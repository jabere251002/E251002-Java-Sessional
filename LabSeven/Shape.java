class Shape { 
    int area(int length, int width) {         
        return length * width; 
    } 

    double area(double radius) {         
        return 3.1416 * radius * radius; 
    } 

    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println("Rectangle Area: " + shape.area(10, 5));
        System.out.println("Circle Area: " + shape.area(7.0));
    }
}
