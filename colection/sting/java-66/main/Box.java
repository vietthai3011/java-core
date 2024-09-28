package main;

public class Box<T1 extends Number, T2> {
    private T1 duLieu;
    private T2 dienTich;

    public Box(T1 duLieu, T2 dienTich) {
        this.duLieu = duLieu;
        this.dienTich = dienTich;
    }

    public T1 getDuLieu() {
        return duLieu;
    }

    public void setDuLieu(T1 duLieu) {
        this.duLieu = duLieu;
    }

    public T2 getDienTich() {
        return dienTich;
    }

    public void setDienTich(T2 dienTich) {
        this.dienTich = dienTich;
    }

}
