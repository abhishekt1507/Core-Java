public class Functions {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";

        System.out.println(s1.length());

        System.out.println(s1.equals(s2));

        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i) + " ");
        }

        System.out.println();

        System.out.println(s2.equalsIgnoreCase(s3));

        String s8 = "RAJA";
        s8 = s8.toLowerCase();
        System.out.println(s8);

        String s9 = "raja";
        s9 = s9.toUpperCase();
        System.out.println(s9);

        String s10 = "Hello";
        System.out.println(s10.startsWith("He"));
        System.out.println(s10.endsWith("lo"));

        String s11 = "RAJA";
        System.out.println(s11.indexOf("A"));

        String s12 = "    RAJA   ";
        System.out.println(s12.trim());

        String s13 = "Sujith";
        System.out.println(s13.contains("ji"));

        String s14 = " ";
        System.out.println(s14.isBlank());
        System.out.println(s14.isEmpty());

        String s15 = "Sujith";
        String s16 = "Kumar";
        System.out.println(s15.concat(s16));

        String s17 = "Ravi Kumar";
        System.out.println(s17.substring(1, 6));

        String s18 = "Hello world";
        System.out.println(s18.replace("world", "Kodnest"));

    }
}
