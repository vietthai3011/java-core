package PhuongTien;

public class HangSX {
    private String tenHangSX, tenQuocGia;

    public HangSX(String tenHangSX, String tenQuocGia) {
        this.tenHangSX = tenHangSX;
        this.tenQuocGia = tenQuocGia;
    }

    @Override
    public String toString() {
        return "HangSX [tenHangSX=" + tenHangSX + ", tenQuocGia=" + tenQuocGia + "]";
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

}
