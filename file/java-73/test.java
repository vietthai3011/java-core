import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class test {
    public static void main(String[] args) {
        try {
            File file = new File(" D:\\Workspace\\java\\java-core\\file\\java-73\\file.out");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SinhVien sinhVien = new SinhVien(1, "Nguyen Van A", 2001, 8);

            oos.writeObject(sinhVien);

            oos.flush();
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
