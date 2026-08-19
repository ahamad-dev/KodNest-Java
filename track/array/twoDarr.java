import java.util.Scanner;

public class twoDarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][5];
        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array Elements are : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
    }
}
