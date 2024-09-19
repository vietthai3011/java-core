package PhuongTien;

public class Oto extends PhuongTienDiChuyen {

    public Oto(String loaiNhienLieu, HangSX hangSX) {
        super("Oto", loaiNhienLieu, hangSX);
    }

    @Override
    public double layVanToc() {
        return 80;
    }
}
