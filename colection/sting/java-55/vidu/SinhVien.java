package vidu;

public class SinhVien implements Comparable<SinhVien> {
    private int maSV;
    private String tenSV, tenLop;
    private double diemTB;

    public SinhVien(int maSV, String tenSV, String tenLop, double diemTB) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tenLop = tenLop;
        this.diemTB = diemTB;
    }

    public void an() {
        System.out.println("An");
    }

    public void ngu() {
        System.out.println("Ngu");
    }

    private String getName() {
        String s = this.tenSV.trim();
        if (s.indexOf(" ") >= 0) {
            int vt = s.lastIndexOf(" ");
            return s.substring(vt + 1);
        }

        return s;
    }

    @Override
    public int compareTo(SinhVien o) {
        String tenThis = this.getName();
        String tenO = o.getName();

        return tenThis.compareTo(tenO);
    }

    @Override
    public String toString() {
        return "SinhVien [maSV=" + maSV + ", tenSV=" + tenSV + ", tenLop=" + tenLop + ", diemTB=" + diemTB + "]";
    }

}
