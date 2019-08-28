class Rectangle {
    private double l;
    private double w;

    public Rectangle(){
        this(100,25);
    }

    public Rectangle(double a){
        this(a,a);
    }

    public Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }

    public Rectangle(Rectangle r){
        this(r.l, r.w);
    }
}

class App3{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(r1);
        Rectangle r3 = new Rectangle(20);
        Rectangle r4 = new Rectangle();
    }
}


