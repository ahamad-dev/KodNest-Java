class Child extends Parent {
    Child() {
        System.out.println("Inside child 0 const");
    }

    Child(int a) {
        super(10);
        System.out.println("Inside child 1 const");
    }
}