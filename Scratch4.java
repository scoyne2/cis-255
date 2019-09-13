public class Scratch4 {
    public static void main(String[] args){
        A obj[] = {new A(), new B()};
        obj[0].mM();
        obj[1].mM();
    }
}

class A{
    void mM(){
        System.out.println("Stupid");
    }

    void sayName(){
        System.out.println("A");
    }

    void aOnly(){
        System.out.println("AOnly");
    }
}

class B extends A {
    void mM(){
        System.out.println("Overridden");
    }

    void sayName(){
        System.out.println("B");
    }

    void bOnly(){
        System.out.println("BOnly");
    }
}
