public class main {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String(" world");
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1.replace("l", "0"));
        System.out.println(s1.repeat(3));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(0, 3));
    }
}
