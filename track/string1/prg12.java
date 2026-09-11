import java.util.Scanner;

public class prg12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strring");
        String str = sc.next();
        char charArr[] = str.toCharArray();
        char revarr[] = new char[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            revarr[i] = charArr[i];
        }
        String revString = new String(revarr);
        if (str.equalsIgnoreCase(revString)) {
            System.out.println("The given String is palindrome");
        } else {
            System.out.println("The given String is NOt Palindrome");
        }
    }

}
