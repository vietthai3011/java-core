public class main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(01, 01, 1998);
        TacGia tacGia1 = new TacGia("Nguyen Van A", ngay1);
        Sach sach1 = new Sach("Tieng anh 1", 100000, 2020, tacGia1);

        Ngay ngay2 = new Ngay(02, 12, 1968);
        TacGia tacGia2 = new TacGia("Nguyen Van B", ngay2);
        Sach sach2 = new Sach("Toan 1", 100000, 2020, tacGia2);

        System.out.println(sach1.getTenSach());
        System.out.println(sach2.getTenSach());

        System.out.println(sach1.KTNamXuatBan(sach2));
    }
}
