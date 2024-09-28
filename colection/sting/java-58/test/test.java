package test;

public class test {
    public static void main(String[] args) {
        // Sử dụng phương thức tĩnh để tạo đối tượng SinhVien từ lớp trừu tượng Nguoi
        Nguoi sv = Nguoi.taoSinhVien("Nguyen Van A", 20, "SV001", "CNTT");

        // Gọi phương thức hiển thị thông tin sinh viên
        sv.hienThiThongTin();
    }

}
