public class Tron extends Hinh {

    private double r;

    public Tron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    public void a() {
        System.out.println("tron");
    }

    @Override
    public double tinhDienTich() {
        return Math.pow(this.r, 2) * Math.PI;
    }

}
