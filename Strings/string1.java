package Strings;
public class string1 {
    public static void main(String[] args) {
        String a = "Avinash";
        String b = "Avinash";
        System.out.println(a==b);

        /* It will be true because the objects are in heap and 
            pointing towards a string pool   */

    String str = new String("Singh");
    String strr = new String("Singh");
    System.out.println(str.equals(strr));               // .equals works as ==

    /* It will be false because now it will be pointing in a heap outside the string pool */
    // for indexing
    System.out.println("Indexing:- " + a.charAt(4));

    //printf
    float r = 121.789456f;
    System.out.printf("%.2f", r);
    }
}
