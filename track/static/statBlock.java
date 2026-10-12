class Demo1 {
    static {
        System.out.println("1st static-Block executed.");
    }
    static {
        System.out.println("2nd static-Block executed.");
    }
    {
        System.out.println("1st NON Static-Block ececuted.");
    }
    {
        System.out.println("2nd NON Static-Block ececuted.");
    }
    {
        System.out.println("3rd NON Static-Block ececuted.");
    }

}

public class statBlock {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Demo1 d1 = new Demo1();

    }
}
