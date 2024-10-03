import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public String themSV(SinhVien sv) {
        if (this.danhSach.add(sv))
            return "\n-----------------   Them SV thanh cong.   -----------------\n";
        return "Them SV that bai.";
    }

    public void inDanhSachSinhVien() {
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
            System.out.println("---------------------------------------------");
        }
    }

    public void kiemTraDanhSachRong() {
        if (this.danhSach.isEmpty()) {
            System.out.println("\n-----------------   Danh sach rong.    -----------------\n");
            return;
        }
        System.out.println("\n-----------------   Danh sach khong rong.    -----------------\n");
    }

    public void soLuongSinhVien() {
        System.out.println("\n------- Danh sach có " + this.danhSach.size() + " sinh vien. -------\n");
    }

    public void xoaSachDanhSachSV() {
        this.danhSach.removeAll(this.danhSach);
        System.out.println("\n-----------------   Da xoa tat ca sinh vien   -----------------\n");
    }

    private void timKiemSinhVien(int maSV, String a, String b, boolean delete) {
        SinhVien temp = new SinhVien(maSV);

        if (this.danhSach.contains(temp)) {
            if (delete) {
                this.danhSach.remove(temp);
            }
            System.out.println("\n" + a + " " + temp + "\n");
            return;
        }
        System.out.println("\n" + b + "\n");
    }

    public void kiemTraSinhVien(int maSV) {
        timKiemSinhVien(maSV, "Tim thay sinh vien: ",
                "-----------------   Khong co sinh vien nhu ma can tim   -----------------", false);
    }

    public void xoaSinhVien(int maSV) {
        timKiemSinhVien(maSV, "Da xoa ",
                "-----------------   Khong the xoa sinh vien vi khong tim thay ma sinh vien   -----------------", true);
    }

    public void timAllSinhVien(String tenSV) {
        System.out.println("Danh sach sinh vien co ten " + tenSV + " la: ");
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getTenSV().equalsIgnoreCase(tenSV)) {
                System.out.println(sinhVien);
            }
        }

    }

    public void sapXepDanhSach() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiemTB() < o2.getDiemTB()) {
                    return -1;
                } else if (o1.getDiemTB() > o2.getDiemTB()) {
                    return 1;
                }
                return 0;
            }

        });
    }

    public void ghiDuLieuXuongFile(File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for (SinhVien sinhVien : danhSach) {
                oos.writeObject(sinhVien);
            }

            oos.flush();
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
