

class Circle2D {

    // Two double data fields named x and y that specify the center of the circle with get methods.
    private double x;
    private double y;
    private double radius;

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    // 	A data field radius with a get method.
    public double getRadius(){
        return radius;
    }


    // A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius.
    public Circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }


    // A constructor that creates a circle with the specified x, y, and radius.
    public Circle2D(int x, int y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    // A method getArea() that returns the area of the circle.
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }


    // A method getPerimeter() that returns the perimeter of the circle.
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }


    // A method contains(double x, double y) that returns true if the specified point (x, y) is inside this circle.
    public boolean contains(double x, double y){
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
    }


    // A method contains(Circle2D circle) that returns true if the specified circle is inside this circle.
    public boolean contains(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= Math.abs(radius - circle.getRadius());
    }


    // A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle.
    public boolean overlaps(Circle2D circle){
        return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= radius + circle.getRadius();
    }
}


 class Exercise10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area is " + c1.getArea());
        System.out.println("Perimeter is " + c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
