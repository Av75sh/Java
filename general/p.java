package general;

public class p {
    public static void main(String[] args) {
        String name = "abcba";
        System.out.println(pal(name));
    }

    static boolean pal(String name){
        name = name.toLowerCase();

        for(int i=0; i<name.length() -1/2; i++){
            char start = name.charAt(i);
            char end = name.charAt(name.length() - 1 -i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
