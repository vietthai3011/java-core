
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RutThamTrungThuong_tree extends HashSet {

    Set<String> tapHopPhieuDuThuong = new TreeSet<String>();

    public RutThamTrungThuong_tree() {
    }

    // 1
    public boolean themPhieuDuThuong(String giaTri) {
        return this.tapHopPhieuDuThuong.add(giaTri);
    }

    public boolean xoaPhieu(String giaTri) {
        return this.tapHopPhieuDuThuong.remove(giaTri);
    }

    public boolean kiemTraPhieuTonTai(String giaTri) {
        return this.tapHopPhieuDuThuong.contains(giaTri);
    }

    public void xoaAllPhieuDuThuong() {
        this.tapHopPhieuDuThuong.clear();
    }

    public int laySoLuong() {
        return this.tapHopPhieuDuThuong.size();
    }

    public String bocThamTrungThuong() {
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.tapHopPhieuDuThuong.size());
        ketQua = (String) this.tapHopPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }

    public void inAllRaPhieu() {
        System.out.println(Arrays.toString(this.tapHopPhieuDuThuong.toArray()));
    }

    public static void main(String[] args) {
        RutThamTrungThuong_tree rt = new RutThamTrungThuong_tree();

        int luaChon;

        do {
            System.out.println("------------------------------------");
            System.out.println("Menu: ");
            System.out.println("1. Them ma so du thuong");
            System.out.println("2. Xoa ma so du thuong");
            System.out.println("3. Kiem tra ma so du thuong co ton tai hay khong");
            System.out.println("4. Xoa tat ca cac phieu du thuong");
            System.out.println("5. So luong phieu du thuong");
            System.out.println("6. Rut tham phieu trung thuong");
            System.out.println("7. In ra all phieu");
            System.out.println("0. Thoat khoi chuong trinh");

            luaChon = new Scanner(System.in).nextInt();
            // new Scanner(System.in).nextLine();

            switch (luaChon) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Nhap vao ma phieu du thuong: ");
                    String giaTri = new Scanner(System.in).nextLine();
                    if (luaChon == 1) {
                        rt.themPhieuDuThuong(giaTri);
                    } else if (luaChon == 2) {
                        rt.xoaPhieu(giaTri);
                    } else {
                        System.out.print("Kiem tra phieu ton tai: ");
                        rt.kiemTraPhieuTonTai(giaTri);
                    }
                    break;
                case 4:
                    rt.xoaAllPhieuDuThuong();
                    System.out.println("Da xoa all phieu du thuong: ");
                    break;
                case 5:
                    System.out.println("So luong phieu la: " + rt.laySoLuong());
                    break;
                case 6:
                    System.out.println("Ma so trung thuong la: " + rt.bocThamTrungThuong());
                    break;
                case 7:
                    System.out.print("Cac loai phieu du thuong: ");
                    rt.inAllRaPhieu();
            }
        } while (luaChon != 0);
    }
}