
import java.io.File;
import java.io.IOException;

/**
 * test
 */
public class test {

    public static void main(String[] args) {

        // Kiểm trs file tônf tại không
        File folder1 = new File("D:\\Workspace\\java\\java-core\\file\\java-67\\test.java");
        File folder2 = new File("D:\\Workspace\\java\\java-core\\file\\java-68");

        System.out.println("folder ton tai: " + folder1.exists());
        System.out.println("folder ton tai: " + folder2.exists());

        // Tạo folder -> mkdir

        File d1 = new File("D:\\Workspace\\java\\java-core\\file\\java-67\\main");
        File d2 = new File("D:\\Workspace\\java\\java-core\\file\\java-67\\tmain");
        // d1.mkdir();
        // d2.mkdir();

        // tạo nhiều thư mục -> mkdirs
        File d3 = new File("D:\\Workspace\\java\\java-core\\file\\java-67\\main_1\\main-2\\main-3\\main-4");
        // d3.mkdirs();

        // *** tạo file
        File file1 = new File(
                "D:\\Workspace\\java\\java-core\\file\\java-67\\main_1\\main-2\\main-3\\main-4\\main.java");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}