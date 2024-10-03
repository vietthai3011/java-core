
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class main {

    public static void copyAll(File f1, File f2) {
        try {
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (f1.isDirectory()) {
            File[] mangFile = f1.listFiles();
            for (File file : mangFile) {
                File newFile = new File(f2.getAbsoluteFile() + "\\" + file.getName());
                copyAll(file, newFile);
            }
        }
    }

    public static void main(String[] args) {

        File f0 = new File("D:\\Workspace\\java\\java-core\\file\\java-70\\f0\\file_test_2.txt");
        File f0_0 = new File("D:\\Workspace\\java\\java-core\\file\\java-70\\f0");
        File f0_copy = new File("D:\\Workspace\\java\\java-core\\file\\java-70\\f0_coppy");
        File f1 = new File("D:\\Workspace\\java\\java-core\\file\\java-70\\file_1.txt");
        File f2 = new File("D:\\Workspace\\java\\java-core\\file\\java-70\\file_2.txt");
        File f3 = new File("D:\\Workspace\\java\\java-core\\file\\java-70\\xyz.txt");
        File f4 = new File("D:\\Workspace\\java\\java-core\\file\\java-70\\file_test.txt");
        File f5 = new File("D:\\Workspace\\java\\java-core\\file\\java-70\\file_test_2.txt");

        // *** Thay ten file
        // System.out.println(f1.renameTo(f2));

        // try {
        // Files.move(f4.toPath(), f5.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // *** Dic chyen File
        // try {
        // Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.ATOMIC_MOVE);
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // *** copy file

        // try {
        // Files.copy(f0_0.toPath(), f0_copy.toPath(),
        // StandardCopyOption.REPLACE_EXISTING);
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // *** copy all
        copyAll(f0_0, f0_copy);
    }
}
