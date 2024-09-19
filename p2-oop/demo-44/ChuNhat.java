public class ChuNhat extends Hinh {

    private double a, b;

    public ChuNhat(ToaDo toaDo, double a, double b) {
        super(toaDo);
        this.a = a;
        this.b = b;
    }

    public void a() {
        System.out.println("chu nhat");
    }

    @Override
    public double tinhDienTich() {
        return this.a * this.b;
    }
}
