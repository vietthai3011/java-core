public class SinhVien implements Comparable<SinhVien> {
    private int maSV;
    private int id;
    private String tenSV;
    private int namSinh;
    private double diemTB;

    public static int soLuongSV = 0;

    public SinhVien(int maSV, String tenSV, int namSinh, double diemTB) {
        soLuongSV++;
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
        this.id = soLuongSV;
    }

    public SinhVien(int maSV) {
        this.maSV = maSV;
    }

    public SinhVien(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien " + id + " [maSV=" + maSV + ", tenSV=" + tenSV + ", namSinh=" + namSinh + ", diemTB="
                + diemTB + "]";
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV - o.maSV;
    }

}
