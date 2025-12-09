class MyShape {     
    void draw() { 
        System.out.println("Drawing shape"); 
    } 

    public static void main(String[] args) {
        MyShape s = new MyShape();
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        s.draw();
        c.draw();
        r.draw();
    }
}

class Circle extends MyShape {     
    @Override     
    void draw() { 
        System.out.println("Drawing Circle"); 
    } 
}

class Rectangle extends MyShape { 
    @Override     
    void draw() { 
        System.out.println("Drawing Rectangle"); 
    } 
}
