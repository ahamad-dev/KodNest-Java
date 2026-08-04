public class ST05 {
    public static void main(String[] args) {
        int completedtopics = 17;
        int total = 20;
        int daily = 3;
        int lear = 15;
        double prog = (double) completedtopics * 100 / total;
        System.out.println("Completed Topics: " + completedtopics);
        System.out.println("Remaining Topics: " + daily);
        System.out.println("Weekly Learning Hours: " + lear);
        System.out.println("Progress Percentage: " + prog);
    }
}
