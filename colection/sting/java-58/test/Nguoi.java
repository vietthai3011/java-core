package test;

public abstract class Nguoi {
    String hoTen;
    int tuoi;

    // Constructor
    public Nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    // Phương thức trừu tượng
    public abstract void hienThiThongTin();

    // Phương thức static để tạo đối tượng Nguoi (SinhVien)
    public static Nguoi taoSinhVien(String hoTen, int tuoi, String maSinhVien, String lopHoc) {
        // Không cần sử dụng 'this', tạo đối tượng SinhVien
        return new SinhVien(hoTen, tuoi, maSinhVien, lopHoc);
    }
}