package test;

public class main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(5678, "Nguyen thi c", "Lap trinh web", 9.8);
        SinhVien sv2 = new SinhVien(1234, "Nguyen Van B", "Lap trinh web", 9.8);

        System.out.println(sv1.compareTo(sv2));
        sv1.an();
        sv1.ngu();
    }
}
