import HoaDon.HoaDonCaPhe;

public class main {
    public static void main(String[] args) {
        HoaDonCaPhe hoaDon1 = new HoaDonCaPhe("Trung Nguyen", 100000, 2);
        HoaDonCaPhe hoaDon2 = new HoaDonCaPhe("vinacoffee", 200000, 3);
        System.out.println(hoaDon1.tinhTongTien());
        System.out.println(hoaDon1.KTKhoiLuong(10));
        System.out.println(hoaDon1.KTKhoiLuong(3));
        System.out.println(hoaDon1.KTTongTien(1000000));
        System.out.println(hoaDon1.giamGia(10));
        System.out.println(hoaDon2.giamGia(10));
        System.out.println(hoaDon1.soTienPhaiTra(10));
        System.out.println(hoaDon2.soTienPhaiTra(10));
    }
}
