public class Child extends Parent {
    Child() {
        this(10);
        System.out.println("Inside child 0 const");
    }

    Child(int a) {
        this(10, 20);
        System.out.println("Inside child 1 - par const");
    }

    Child(int a, int b) {

        System.out.println("Inside child 2 -par  const");
    }
}
