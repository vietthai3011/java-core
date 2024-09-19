package PhuongTien;

public class MayBay extends PhuongTienDiChuyen {

    public MayBay(String loaiNhienLieu, HangSX hangSX) {
        super("May bay", loaiNhienLieu, hangSX);
    }

    @Override
    public double layVanToc() {
        return 500;
    }

    public void catCanh() {
        System.out.println("Cat canh...");
    }

    public void haCanh() {
        System.out.println("Ha canh...");
    }

}
