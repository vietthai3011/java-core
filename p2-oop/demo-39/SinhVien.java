public class SinhVien extends ConNguoi {

    private String lop, truong;

    public SinhVien(String ten, int namSinh, String lop, String truong) {
        super(ten, namSinh);
        this.lop = lop;
        this.truong = truong;
    }

    public void lamBaiTap() {
        System.out.println("Lam bai tap");
    }
}
