public abstract class Hinh {
    protected ToaDo toaDo;

    public Hinh(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public abstract double tinhDienTich();
}
