public class main {
    public static void main(String[] args) {
        ToaDo toaDo1 = new ToaDo(1, 2);
        ToaDo toaDo2 = new ToaDo(3, 4);
        ToaDo toaDo3 = new ToaDo(6, 7);

        Hinh hinh1 = new Diem(toaDo1);
        Hinh hinh2 = new Tron(toaDo2, 10);
        Hinh hinh3 = new ChuNhat(toaDo3, 10, 12);

        System.out.println(hinh1.tinhDienTich());
        System.out.println(hinh2.tinhDienTich());
        System.out.println(hinh3.tinhDienTich());
    }
}
