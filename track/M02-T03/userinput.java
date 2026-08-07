import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter byte value: ");
        byte a = sc.nextByte();
        System.out.println("the Byte Value is: " + a);

        System.out.println("Enter short value: ");
        short b = sc.nextShort();
        System.out.println("the short Value is: " + b);

        System.out.println("Enter int value: ");
        int c = sc.nextInt();
        System.out.println("the int Value is: " + c);

        System.out.println("Enter long value: ");
        long d = sc.nextLong();
        System.out.println("the long Value is: " + d);

        System.out.println("Enter float value: ");
        float e = sc.nextFloat();
        System.out.println("the float Value is: " + e);

        System.out.println("Enter double value: ");
        double f = sc.nextDouble();
        System.out.println("the double Value is: " + f);

        System.out.println("Enter boolean value: ");
        boolean g = sc.nextBoolean();
        System.out.println("the Boolean Value is: " + g);
    }
}
