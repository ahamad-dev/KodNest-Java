public class ST04 {
    public static void main(String[] args) {
        int totalMarks = 78 + 84 + 69 + 91 + 88;
        float principal = 10000.0f;
        float rate = 6.5f;
        float time = 2.0f;
        double weight = 72.0;
        double height = 1.8;
        double simpleIntrest = principal * rate * time / 100.0;
        double total = principal + simpleIntrest;
        double bmi = weight / (height * height);
        double percentage = (double) totalMarks * 100.0 / 500;
        System.out.println("Simple Interest: " + simpleIntrest);
        System.out.println("Total Amount: " + total);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
    }
}
