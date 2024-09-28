package test;

public class SinhVien extends Nguoi {
    String maSinhVien;
    String lopHoc;

    // Constructor của lớp SinhVien
    public SinhVien(String hoTen, int tuoi, String maSinhVien, String lopHoc) {
        super(hoTen, tuoi); // Gọi constructor của lớp cha Nguoi
        this.maSinhVien = maSinhVien;
        this.lopHoc = lopHoc;
    }

    // Cài đặt phương thức trừu tượng
    @Override
    public void hienThiThongTin() {
        System.out.println("Tên: " + hoTen + ", Tuổi: " + tuoi + ", Mã SV: " + maSinhVien + ", Lớp: " + lopHoc);
    }
}