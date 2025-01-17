package Functions;
// Variable length Argument => (int ...v)

import java.util.Arrays;

public class variableargus4 {
    public static void main(String[] args){
        fun(2,3, "Avinash", "Kumar", "Singh");

    }

    static void fun( int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
}
