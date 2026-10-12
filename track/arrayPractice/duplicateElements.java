
public class duplicateElements {
    public static void main(String[] args) {
        int arr[] = { 4, 9, 1, 3, 2, 8, 9, 10, 10, 1, 4 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] == arr[j + 1]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
