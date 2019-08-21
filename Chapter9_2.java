/*
Chapter 9 Assignment 2
Sean Coyne
*/

class MyInteger{
    // An int data field named value that stores the int value represented by this object.
    private int value ;

    // A constructor that creates a MyInteger object for the specified int value.
    public MyInteger(int myValue){
        this.value = myValue;
    }

    // A get method that returns the int value.
    public int getMyInt(){
        return value;
    }

    // Methods isEven(), isOdd(), and isPrime() that return true if the value is even, odd, or prime, respectively.
    public boolean isEven(){
        return (value % 2) == 0;
    }

    public boolean isOdd(){
        return (value % 2) == 1;
    }

    public boolean isPrime( ){
        // Corner case
        if (value <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < value; i++)
            if (value % i == 0)
                return false;
        return true;
    }

    // Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.
    public static boolean isEven(int myValue){
        return (myValue % 2) == 0;
    }

    public static boolean isOdd(int myValue){
        return (myValue % 2) == 1;
    }

    public static boolean isPrime(int myValue){
        // Corner case
        if (myValue <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < myValue; i++)
            if (myValue % i == 0)
                return false;
        return true;
    }

    // Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger)
    // that return true if the specified value is even, odd, or prime, respectively.
    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    // Methods equals(int) and equals(MyInteger) that return true if the value in the object is equal to the specified value.
    public boolean equals(int compareInt){
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger){
        return this.value == myInteger.value;
    }

    // A static method parseInt(char[]) that converts an array of numeric characters to an int value.
    public static int parseInt(char[] array){
        String temp = "";
        for(int i=0; i< array.length; i++)
            if(Character.isDigit(array[i]))
                temp = temp + (array[i]);
        return Integer.parseInt(temp);
    }

    // A static method parseInt(String) that converts a string into an int value.
    public static int parseInt(String myString){
        return Integer.parseInt(myString);
    }
}


 class Exercise10_03 {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}
