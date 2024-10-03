public class Student {
    private int maSV;
    private String ten, tenLop;
    private int namSinh;

    public Student(int maSV, String ten, String tenLop, int namSinh) {
        this.maSV = maSV;
        this.ten = ten;
        this.tenLop = tenLop;
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "Student [maSV=" + maSV + ", ten=" + ten + ", tenLop=" + tenLop + ", namSing=" + namSinh + "]";
    }
}
