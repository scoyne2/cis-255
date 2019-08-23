import org.w3c.dom.Node;

class Outer {
    private Node n;

    class Node {
        private int a;

        private Node(int c){
            a = c;
        }

    }

    public Outer(int d){
        n = new Node(3);
    }

}


class App{

    public static void main(String[] args) {
        Outer o = new Outer(4);
        //Node n = new Node(5);
    }
}

