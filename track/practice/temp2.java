class Addition {
    short add(short a, short b) {
        return (short) (a + b);
    }

    int add(int a, int b) {
        return a + b;
    }

}

public class temp2 {
    public static void main(String[] args) {
        Addition al = new Addition();
        System.out.println(al.add(10, 20));

    }

}
