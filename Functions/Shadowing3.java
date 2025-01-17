package Functions;
public class Shadowing3 {
    int x = 10;                                                                    //global scope
    public static void main(String[] args){
        int x = 21;                                                                 // local scope
            System.out.println("Value of local x : " +x);

            Shadowing3 object = new Shadowing3();                                // create an intance of the class
            System.out.print("Value in globla using super: " + object.x);   

           // System.out.print("Value in globla using super: " + super.x);
    }

}
