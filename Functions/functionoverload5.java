package Functions;
//function overloading => happens at compile time (which one to execute)

public class functionoverload5 {
    public static void main(String[] args){
        sum(3,4);
        fun(45);
        fun("Avinash");

    }

    static int sum(int a, int b){
        System.out.println("Return sum: ");
        return a + b;
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String b){
        System.out.println(b);
    }
}
