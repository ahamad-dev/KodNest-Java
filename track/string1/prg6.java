public class prg6 {
    public static void main(String[] args) {
        String s1 = "KodNest Technologies";
        System.out.println(s1);// KodNest Technologies
        System.out.println(s1.toLowerCase());// kodnest technologies
        System.out.println(s1.toUpperCase());// KODNEST TECHNOLOGIES
        System.out.println(s1.charAt(3));// N
        // System.out.println(s1.charAt(99)); //Exception
        System.out.println(s1.contains("Nest"));// true
        System.out.println(s1.contains("nest"));// false
        System.out.println(s1.startsWith("Kod"));
        System.out.println(s1.startsWith("Nest"));
        System.out.println(s1.endsWith("ies"));
        System.out.println(s1.endsWith("Kod"));
        System.out.println(s1.indexOf('K'));
        System.out.println(s1.indexOf("e"));
        System.out.println(s1.length());
        System.out.println(s1.replace('e', 'A'));
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 14));

    }
}
