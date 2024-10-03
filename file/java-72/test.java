
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Path p = FileSystems.getDefault().getPath("D:\\Workspace\\java\\java-core\\file\\java-71",
                "test.txt");
        try {
            List<String> list = Files.readAllLines(p, StandardCharsets.UTF_8);
            for (String string : list) {
                System.out.println(string);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
