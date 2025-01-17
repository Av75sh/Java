public class merged {
    public class MergeStringsAlternatively {

        public static String mergeAlternately(String word1, String word2) {
            StringBuilder merged = new StringBuilder();
            int i = 0, j = 0;
    
            // Alternate merging
            while (i < word1.length() && j < word2.length()) {
                merged.append(word1.charAt(i++)); // Add character from word1
                merged.append(word2.charAt(j++)); // Add character from word2
            }
    
            // Append remaining characters (if any)
            while (i < word1.length()) {
                merged.append(word1.charAt(i++));
            }
            while (j < word2.length()) {
                merged.append(word2.charAt(j++));
            }
    
            return merged.toString();
        }
    
        public static void main(String[] args) {
            String word1 = "abc";
            String word2 = "pqrst";
            String result = mergeAlternately(word1, word2);
            System.out.println("Merged String: " + result);
        }
    }
    
}
