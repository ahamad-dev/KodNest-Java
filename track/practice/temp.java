public class temp {

    public static void main(String[] args) {
        int[] num = { 42, 7, 19, 88, 3, 65, 12, 91, 34, 23 };
        int temp = num[0], temp1 = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > temp) {
                temp1 = temp;
                temp = num[i];
            }
        }

        System.out.println(temp1);
    }
}
