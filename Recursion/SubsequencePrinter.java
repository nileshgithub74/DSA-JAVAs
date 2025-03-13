public class SubsequencePrinter {
    public static void printSubsequences(String str, String output, int index) {
       
        if (index == str.length()) {
            System.out.println(output);
            return;
        }

        printSubsequences(str, output, index + 1);

        printSubsequences(str, output + str.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Subsequences of \"" + str + "\":");
        printSubsequences(str, "", 0);
    }
}
