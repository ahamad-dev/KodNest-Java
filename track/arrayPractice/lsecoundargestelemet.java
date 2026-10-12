import java.util.*;

public class lsecoundargestelemet {

    public static void main(String[] args) {
        int arr[] = { 4, 9, 1, 3, 2, 8, 9, 10 };
        int first = arr[0];
        int second = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
