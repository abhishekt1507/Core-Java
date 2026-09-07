public class Functions {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        // Prints String length
        System.out.println(s1.length());

        // Prints String content equal or not
        System.out.println(s1.equals(s2));

        // Traversing the String using charAt()
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i) + " ");
        }
    }
}
