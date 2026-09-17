class Demo3 {
    static {
        System.out.println("static 1");
    }
    static {
        System.out.println("static 2");
    }
    static {
        System.out.println("static 3");
    }
    {
        System.out.println("instance 1");
    }
    {
        System.out.println("instance 2");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Demo3 d1 = new Demo3();
        Demo3 d2 = new Demo3();
    }
}