
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class test {
    public static void main(String[] args) {
        File f0 = new File("D:\\Workspace\\java\\java-core\\file\\java-69\\f0");
        File f0_1 = new File("D:\\Workspace\\java\\java-core\\file\\java-69\\f0_1");
        File vidu = new File("D:\\Workspace\\java\\java-core\\file\\java-69\\vidu.txt");

        // f0.deleteOnExit();
        // f0_1.deleteOnExit();
        // System.out.println(vidu.delete());
        xoaFile2(f0);
        Path p0 = FileSystems.getDefault().getPath("D:\\\\Workspace\\\\java\\\\java-core\\\\file\\\\java-69", "f0");
        Path p0_1 = FileSystems.getDefault().getPath("D:\\\\Workspace\\\\java\\\\java-core\\\\file\\\\java-69", "f0_1");
        Path p_vidu = vidu.toPath();
        // try {
        // // Files.deleteIfExists(p0);
        // // Files.deleteIfExists(p0_1);
        // // Files.deleteIfExists(p_vidu);
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
    }

    public static void xoaFile(File fx) {
        if (fx.isFile()) {
            System.out.println("Xoa file " + fx.getName());
            fx.delete();
        } else if (fx.isDirectory()) {
            File[] mangFile = fx.listFiles();
            for (File file : mangFile) {
                xoaFile(file);
            }
            System.out.println("Xoa thu muc " + fx.getName());
            fx.delete();
        }
    }

    public static void xoaFile2(File fx) {
        if (fx.isFile()) {
            try {
                Files.deleteIfExists(fx.toPath());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else if (fx.isDirectory()) {
            File[] mangFile = fx.listFiles();
            for (File file : mangFile) {
                xoaFile2(file);
            }
            System.out.println("Xoa thu muc " + fx.getName());
            try {
                Files.deleteIfExists(fx.toPath());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
