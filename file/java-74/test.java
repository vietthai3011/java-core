
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class test {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Workspace\\java\\java-core\\file\\java-73\\file.out");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            while (true) {
                try {
                    SinhVien sinhVien = (SinhVien) ois.readObject(); // Đọc đối tượng từ luồng

                    System.out.println(sinhVien); // In đối tượng ra
                } catch (EOFException e) {
                    break; // Kết thúc vòng lặp khi đạt đến cuối file
                }
            }
            ois.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
