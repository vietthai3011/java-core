import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien danhSachSV = new DanhSachSinhVien();
        int luaChon;

        do {
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.	Thêm sinh viên vào danh sách.\n"
                            + "2.	In danh sách sinh viên ra màn hình.\n"
                            + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                            + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
                            + "5.	Làm rỗng danh sách sinh viên.\n"
                            + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                            + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                            + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                            + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                            + "10.  Lưu danh sách sinh viên xuống tập tin.\n"
                            + "11.  Dọc anh sách sinh viên từ tập tin.\n"
                            + "0.   Thoát khỏi chương trình");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhap ma SV: ");
                    int maSV = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Nhap ten SV: ");
                    String tenSV = sc.nextLine();

                    System.out.println("Nhap nam sinh: ");
                    int namSinh = sc.nextInt();

                    System.out.println("Nhap diem TB: ");
                    double diemTB = sc.nextDouble();

                    SinhVien sv = new SinhVien(maSV, tenSV, namSinh, diemTB);
                    System.out.println(danhSachSV.themSV(sv));
                    break;

                case 2:
                    System.out.println("Danh sach sinh vien: ");
                    danhSachSV.inDanhSachSinhVien();
                    break;

                case 3:
                    danhSachSV.kiemTraDanhSachRong();
                    break;

                case 4:
                    danhSachSV.soLuongSinhVien();
                    break;

                case 5:
                    danhSachSV.xoaSachDanhSachSV();
                    break;

                case 6:
                    System.out.printf("Nhap ma so sinh vien can tim: ");
                    int maSVCanTim = sc.nextInt();
                    danhSachSV.kiemTraSinhVien(maSVCanTim);
                    break;

                case 7:
                    System.out.printf("Nhap ma so sinh vien can tim: ");
                    int maSVCanXoa = sc.nextInt();
                    danhSachSV.xoaSinhVien(maSVCanXoa);
                    break;

                case 8:
                    sc.nextLine();
                    System.out.printf("Nhap ten sinh vien can tim: ");
                    String tenSVCanTim = sc.nextLine();
                    danhSachSV.timAllSinhVien(tenSVCanTim);
                    break;

                case 9:
                    danhSachSV.sapXepDanhSach();
                    System.out.println("Da sap xep thanh cong");
                    danhSachSV.inDanhSachSinhVien();
                    break;

                case 10:
                    sc.nextLine();
                    System.out.print("\nNhap vao duong dan File can ghi: ");
                    String nhapFileCanGhi = sc.nextLine();
                    danhSachSV.ghiDuLieuXuongFile(new File(nhapFileCanGhi));
                    System.out.println("\n  -----------------Du lieu da ghi xuong file-----------------");
                    break;
                case 11:
                    sc.nextLine();
                    System.out.print("\nNhap vao duong dan File can doc: ");
                    String nhapFileCanDoc = sc.nextLine();
                    danhSachSV.docDuLieuTuFile(new File(nhapFileCanDoc));
                    System.out.println("\n  -----------------Da doc xong du lieu-----------------");
                    break;
            }
            // D:\Workspace\java\java-core\file\java-74\file.out
        } while (luaChon != 0);

    }
}
