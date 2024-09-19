import PhuongTien.*;

public class main {
    public static void main(String[] args) {
        HangSX hang1 = new HangSX("Toyota", "Nhat Ban");
        HangSX hang2 = new HangSX("Huyndai", "Nhat Ban");
        HangSX hang3 = new HangSX("Maybach", "Duc");

        PhuongTienDiChuyen pt1 = new MayBay("Xang", hang1);
        PhuongTienDiChuyen pt2 = new Oto("Xang", hang2);
        PhuongTienDiChuyen pt3 = new XeDap("Com", hang3);

        System.out.println(pt1.thisLog());
    }
}
