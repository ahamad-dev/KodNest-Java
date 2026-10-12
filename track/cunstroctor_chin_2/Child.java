class Child extends Parent {
    int a = 20;

    void disp2() {
        System.out.println("Parents a: " + super.a);
        System.out.println("Childs a: " + a);
    }
}
