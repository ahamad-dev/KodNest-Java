public class Main {
    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        acessMethod(jd);
        PythonDeveloper pd = new PythonDeveloper();
        acessMethod(pd);

    }

    public static void acessMethod(Developer dev) {
        dev.work();
        dev.project();

    }
}
