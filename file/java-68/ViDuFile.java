
import java.io.File;
import java.util.Scanner;

public class ViDuFile {
    File file;

    public ViDuFile(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemTraFileThucThi() {
        return this.file.canExecute();
    }

    public boolean kiemTraFileDoc() {
        return this.file.canRead();
    }

    public boolean kiemTraFileGhi() {
        return this.file.canWrite();
    }

    public String inDuongDan() {
        return this.file.getAbsolutePath();
    }

    public String inTenFile() {
        return this.file.getName();
    }

    public String kiemTraFileTapTinHayTapTin() {
        if (this.file.isFile()) {
            return "Day la tap tin";
        } else if (this.file.isDirectory()) {

            return "Day la thu muc";
        }
        return "khong la tap tin hay thu muc";
    }

    public void inCayThuMuc() {
        this.inChiTietCayThucMuc(this.file, 1);
    }

    public void inChiTietCayThucMuc(File f, int bac) {
        // System.out.print("|");
        for (int i = 0; i < bac; i++) {
            System.out.print("\t");
        }
        System.out.print("|__");
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                inChiTietCayThucMuc(fx, bac + 1);
            }
        }

    }

    public void inDanhSachFileCon() {
        if (this.file.isDirectory()) {
            System.out.println("Cac tap tin con, thu muc con: ");
            File[] mangCon = this.file.listFiles();
            for (File file : mangCon) {
                System.out.println(file.getAbsolutePath());
            }
        } else if (this.file.isFile()) {
            System.out.println("Day la tap tin, khong co du lieu con ben trong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        System.out.print("Nhap ten File: ");
        String tenFile = sc.nextLine();

        ViDuFile vdf = new ViDuFile(tenFile);

        do {
            System.out.println("MENU ---------- ");
            System.out.println("1. Kiểm tra file có thể thực thi: ");
            System.out.println("2. Kiểm tra file có thể đọc: ");
            System.out.println("3. Kiểm tra file có thể ghi: ");
            System.out.println("4. In đường dẫn: ");
            System.out.println("5. In tên file: ");
            System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
            System.out.println("7. In ra danh sách các file con: ");
            System.out.println("8. In ra cây thư mục: ");
            System.out.println("0. Thoát chương trình.");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.println("File co the thuc thi: " + vdf.kiemTraFileThucThi());
                    break;

                case 2:
                    System.out.println("File co the doc: " + vdf.kiemTraFileDoc());
                    break;

                case 3:
                    System.out.println("File co the ghi: " + vdf.kiemTraFileGhi());
                    break;

                case 4:
                    System.out.println("File co duong dan la: " + vdf.inDuongDan());
                    break;

                case 5:
                    System.out.println("File co ten: " + vdf.inTenFile());
                    break;

                case 6:
                    System.out.println(vdf.kiemTraFileTapTinHayTapTin());
                    break;

                case 7:
                    vdf.inDanhSachFileCon();
                    break;
                case 8:
                    vdf.inCayThuMuc();
                    break;
            }
        } while (luaChon != 0);
    }
}
