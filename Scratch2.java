class Outer2 {
     private int n;

     public Outer2(int n) {
         this.n = n;
     }

     //copy constructor
     public Outer2(Outer2 o){
        n=o.n;
    }
}

class App2{
    public static void main(String[] args) {
        Outer2 o1 = new Outer2(10);

        //o2 has to be a copy of o1. o2 should have its field variables the same as o1
        //this will make a similar object, but not the same
        Outer2 o2 = new Outer2(o1);

    }
}

