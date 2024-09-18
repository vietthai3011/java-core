public class BoPhim {
    private String tenPhim;
    private int namSX;
    private HangSX hangSX;
    private int giaVe;
    private NgayChieu ngayChieu;

    public BoPhim(String tenPhim, int namSX, HangSX hangSX, int giaVe, NgayChieu ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSX = namSX;
        this.hangSX = hangSX;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public boolean KTGiaVe(Object obj) {
        BoPhim temp = (BoPhim) obj;
        return this.giaVe < temp.giaVe;
    }

    public String getTenHang() {
        return this.hangSX.getTenHang();
    }

    public double giaSauKhiKM(double x) {
        return this.giaVe * (1 - x / 100);
    }
}
