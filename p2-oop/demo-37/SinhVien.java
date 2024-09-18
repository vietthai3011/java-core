public class SinhVien {
    private int maSoSV;
    private String hoVaTen;
    private NgaySinh ngaySinh;
    private double diemTrungBinh;
    private Lop lop;

    public SinhVien(int maSoSV, String hoVaTen, NgaySinh ngaySinh, double diemTrungBinh, Lop lop) {
        this.maSoSV = maSoSV;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
        this.lop = lop;
    }

    public String getTenKhoa() {
        return this.lop.getTenKhoa();
    }

    public boolean KTDau() {
        return this.diemTrungBinh > 5.0;
    }

    public boolean KTNgaySing(Object obj) {
        SinhVien temp = (SinhVien) obj;
        return this.ngaySinh.getNam() == temp.ngaySinh.getNam();
    }
}
