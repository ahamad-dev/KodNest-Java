public class missingelement {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8 };
        int sum = 0;
        int diff = 0;
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        for (int i = 1; i <= len + 1; i++) {
            diff += i;

        }

        System.out.println(diff - sum);
    }
}
