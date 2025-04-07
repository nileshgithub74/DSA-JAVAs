package StrDemo;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "list";
        String str2 = "silent";

        int n = str1.length();
        int m = str2.length();

        // char[] s = str1.toCharArray();
        // char[] t = str2.toCharArray();

        int[] freq = new int[26];

        if (n != m) {
            System.out.println("Not Anagram");
            return;
        }

        for (int i = 0; i < n; i++) {

            freq[str1.charAt(i) - 'a']++;

            freq[str2.charAt(i) - 'a']--;

        }

        for (int x : freq) {
            if (x != 0) {

                return;
            }

        }

        System.out.println("Anagram");

    }

}
