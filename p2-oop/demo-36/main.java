public class main {
    public static void main(String[] args) {
        HangSX hang1 = new HangSX("Mavel", "My");
        HangSX hang2 = new HangSX("DC", "My");
        NgayChieu ngayChieu1 = new NgayChieu(14, 02, 2023);
        NgayChieu ngayChieu2 = new NgayChieu(17, 10, 2012);
        BoPhim phim1 = new BoPhim("Nguoi soi", 2012, hang1, 10000, ngayChieu1);
        BoPhim phim2 = new BoPhim("Nguoi soi", 2012, hang2, 20000, ngayChieu1);

        System.out.println(phim1.KTGiaVe(phim2));
        System.out.println(phim1.getTenHang());
        System.out.println(phim2.getTenHang());

        System.out.println(phim1.giaSauKhiKM(10));
    }
}
