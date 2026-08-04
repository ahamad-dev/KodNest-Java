public class practice2 {
    public static void main(String[] args) {
        int javaHoursPerDay = 2;
        int aptitudeHoursPerDay = 1;
        int numberOfDays = 5;
        int weeklyJava = javaHoursPerDay * numberOfDays;
        int weeklyApti = aptitudeHoursPerDay * numberOfDays;
        int totalPreparation = weeklyJava + weeklyApti;
        System.out.println("Java: " + weeklyJava);
        System.out.println("Aptitude: " + weeklyApti);
        System.out.println("Total: " + totalPreparation);
    }

}
