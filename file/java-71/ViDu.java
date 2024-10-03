
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ViDu {
    public static void main(String[] args) {
        PrintWriter pw;
        try {
            pw = new PrintWriter("D:\\Workspace\\java\\java-core\\file\\java-71\\test.txt", "UTF-8");

            pw.print("Hello ");
            pw.println("world");
            pw.println(Math.PI + " la so PI");

            Student s1 = new Student(1234, "Nguyen Van A", "1233123", 2002);
            pw.println(s1);
            pw.append("Xin chao");

            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
