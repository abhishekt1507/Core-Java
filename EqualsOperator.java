
public class EqualsOperator {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str1 == str2);
        System.out.println(str3 == str4);

    }
}