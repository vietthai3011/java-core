public class SV {
    private int ma;
    private String tenSv;
    private double DTB;
    private PhanLoai phanLoai;
    private int hehe;

    public SV(int ma, String tenSv, double dTB) {
        this.ma = ma;
        this.tenSv = tenSv;
        this.DTB = dTB;
        this.hehe = loai();
    }

    public int loai() {
        if (this.DTB >= 8)
            return PhanLoai.Gioi.getDiem();
        if (this.DTB >= 6)
            return PhanLoai.Kha.getDiem();
        if (this.DTB >= 4)
            return PhanLoai.TB.getDiem();
        if (this.DTB >= 1)
            return PhanLoai.Yeu.getDiem();
        return PhanLoai.DuoiHoc.getDiem();
    }

    @Override
    public String toString() {
        return "SV [ma=" + ma + ", tenSv=" + tenSv + ", phanLoai=" + hehe + "]";
    }

}
