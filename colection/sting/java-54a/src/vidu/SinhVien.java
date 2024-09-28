package vidu;

public class SinhVien implements Comparable<SinhVien> {

    private int maSV;
    private String tenSV, tebLop;
    private double diemTB;

    public SinhVien(int maSV, String tenSV, String tebLop, double diemTB) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tebLop = tebLop;
        this.diemTB = diemTB;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV - ((SinhVien) o).maSV;
    }
}
