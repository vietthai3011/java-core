public class main {
    public static void main(String[] args) {
        NgaySinh ngay1 = new NgaySinh(30, 11, 2002);
        NgaySinh ngay2 = new NgaySinh(30, 11, 2002);
        // NgaySinh ngay2 = new NgaySinh(20, 12, 2004);

        Lop lop1 = new Lop("Lap trinh web", "CNTT1");
        Lop lop2 = new Lop("Tri tue nhanh tao", "CNTT2");

        SinhVien sinhVien1 = new SinhVien(1243456, "Ngo Viet Thai", ngay1, 10, lop1);
        SinhVien sinhVien2 = new SinhVien(103898870, "Nguyen Van A", ngay2, 4, lop2);

        System.out.println(sinhVien1.KTDau());
        System.out.println(sinhVien2.KTDau());

        System.out.println(sinhVien1.getTenKhoa());
        System.out.println(sinhVien2.getTenKhoa());

        System.out.println(sinhVien1.KTNgaySing(sinhVien2));
    }
}
