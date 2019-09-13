public class Animal {
    public void method1() {
        System.out.println("Animal 1");
    }

    public void method2() {
        System.out.println("Animal 2");
    }

    public String toString() {
        return "Animal";
    }
}

public class Pigeon extends Bird {
    public void method2() {
        System.out.println("Pigeon 2");
    }

    public String toString() {
        return "Pigeon";
    }
}

public class Bird extends Animal {
    public void method1() {
        System.out.println("Bird 1");
    }
}

public class Cat extends Animal {
    public void method1() {
        System.out.println("Cat 1");
    }
}



public static void main(String[] args) {
    Animal[] elements = {new Cat(), new Pigeon(), new Animal(), new
            Bird()};
    for (int i = 0; i < elements.length; i++) {
        System.out.println(elements[i]);
        elements[i].method1();
        elements[i].method2();
        System.out.println();
    }
}