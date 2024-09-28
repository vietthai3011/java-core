public class ViDu {

    public static void main(String[] args) {
        String s1 = new String("Hello World");
        String s2 = new String("HellO world");
        String s3 = s1.replaceAll("l", "1");
        String s4 = s1.concat(s2);
        String s5 = new String("HElleo WoEreleDE");

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        // System.out.println(s3);
        // System.out.println(s4);
        // System.out.println(s5.replaceAll("(?i)e", "0"));
        System.out.println(s1.join("-", "hello", "world"));
        System.out.println("123");
    }
}