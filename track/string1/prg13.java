import java.util.Arrays;
import java.util.Scanner;

public class prg13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1 and String 2");
        String str1 = sc.next();
        String str2 = sc.next();
        if (str1.length() != str2.length()) {
            System.out.println("NOt an anagram");
            return;
        }
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sortedarr1 = new String(arr1);
        String sortedarr2 = new String(arr1);
        if (sortedarr1.equals(sortedarr2)) {
            System.out.println("the given string is anagram");
        } else {
            System.out.println("the given string is not an anagram");
        }
    }
}
