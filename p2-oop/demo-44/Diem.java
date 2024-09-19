public class Diem extends Hinh {

    public Diem(ToaDo toaDo) {
        super(toaDo);
    }

    public void a() {
        System.out.println("diem");
    }

    @Override
    public double tinhDienTich() {
        return 1;
    }
}
