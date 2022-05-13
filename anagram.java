package assignment4;

import java.util.Arrays;

public class anagram {
    static void anagramcheck(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean result = true;
        if (s1.length() != s2.length()) {
            result = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            result = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (result) {
            System.out.println(s1 + " and " + s2 + " -> anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " -> not anagrams");
        }
    }

    public static void main(String[] args) {
        anagramcheck("nip", "pin");
        anagramcheck("Aadarsh", "Delay");
    }
}
