package PhuongTien;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected String loaiNhienLieu;
    protected HangSX hangSX;

    public PhuongTienDiChuyen(String tenLoaiPhuongTien, String loaiNhienLieu, HangSX hangSX) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.loaiNhienLieu = loaiNhienLieu;
        this.hangSX = hangSX;
    }

    public String layTenHangSX() {
        return this.hangSX.getTenHangSX();
    }

    public void batDau() {
        System.out.println("Khoi dong...");
    }

    public void tangToc() {
        System.out.println("Tang toc...");
    }

    public void dungLai() {
        System.out.println("Dung lai...");
    }

    public PhuongTienDiChuyen thisLog() {
        return this;
    }

    @Override
    public String toString() {
        return "PhuongTienDiChuyen [tenLoaiPhuongTien=" + tenLoaiPhuongTien + ", loaiNhienLieu=" + loaiNhienLieu
                + ", hangSX=" + hangSX + "]";
    }

    public abstract double layVanToc();
}
