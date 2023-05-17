import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Convert strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if lengths are equal
        if (a.length() != b.length()) {
            return false;
        }

        // Frequency array or hashmap
        int[] freq = new int[26]; // Assuming English alphabet characters

        // Count frequencies in the first string
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            freq[ch - 'a']++;
        }

        // Decrement frequencies for characters in the second string
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            freq[ch - 'a']--;
        }

        // Check if all frequencies are zero
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
