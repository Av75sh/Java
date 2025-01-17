package general;

public class gcd {
        public static String gcdOfStrings(String str1, String str2) {
            if (!(str1 + str2).equals(str2 + str1)) {
                return "";
            }
            
            int gcdLength = gcd2(str1.length(), str2.length());
            return str1.substring(0, gcdLength);
        }
    
        private static int gcd2(int a, int b) {
            return b == 0 ? a : gcd2(b, a % b);
        }
}
