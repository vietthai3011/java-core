import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        TuDien tuDien = new TuDien();

        Scanner sc = new Scanner(System.in);

        int luaChon;

        do {
            System.out.println("---------------");
            System.out.println("MENU ");
            System.out.println("Tra từ điển Anh - Việt:\n"
                    + "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
                    + "2. Xóa từ\n"
                    + "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
                    + "4. In ra danh sách từ khóa\n"
                    + "5. Lấy số lượng từ\n"
                    + "6. Xóa tất cả các từ khóa\n"
                    + "0. Thoát khỏi chương trình\n"
                    + "");

            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập vào từ khóa: ");
                    String tuKhoa = sc.nextLine();
                    System.out.print("Nhập vào ý nghĩa: ");
                    String yNghia = sc.nextLine();
                    tuDien.themTuDien(tuKhoa, yNghia);
                    break;

                case 2:
                case 3:
                    System.out.print("Nhập vào từ khóa: ");
                    String tuKhoa1 = sc.nextLine();
                    if (luaChon == 2) {
                        tuDien.xoaTu(tuKhoa1);
                        System.out.println("Da xoa tu khoa " + tuKhoa1);
                    } else if (luaChon == 3) {
                        System.out.println("Ý nghĩa là: " + tuDien.traTu(tuKhoa1));
                    }
                    break;

                case 4:
                    tuDien.inTuKhoa();
                    break;

                case 5:
                    System.out.println("So luong tu khoa la: " + tuDien.soLuongTuKhoa());
                    break;

                case 6:
                    tuDien.xoaAll();
                    System.out.println("Da xoa all");
                    break;

            }
        } while (luaChon != 0);

    }
}
