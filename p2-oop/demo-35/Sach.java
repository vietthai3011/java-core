public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacGia;

    public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public boolean KTNamXuatBan(Object obj) {
        Sach temp = (Sach) obj;
        return this.namXuatBan == temp.namXuatBan;
    }

    public double giaSauKhiGiam(double x) {
        return this.giaBan * (1 - x / 100);
    }
}
