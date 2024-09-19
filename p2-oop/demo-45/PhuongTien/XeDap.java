package PhuongTien;

public class XeDap extends PhuongTienDiChuyen {

    public XeDap(String loaiNhienLieu, HangSX hangSX) {
        super("Xe dap", loaiNhienLieu, hangSX);
    }

    @Override
    public double layVanToc() {
        return 12;
    }

}
