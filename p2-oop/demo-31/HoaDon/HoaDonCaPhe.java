package HoaDon;

/**
 * HoaDonCaPhe
 */
public class HoaDonCaPhe {
    private String ten;
    private double giaTien1Kg;
    private double khoiLuong;

    public HoaDonCaPhe(String ten, double giaTien, double khoiLuong) {
        this.ten = ten;
        this.giaTien1Kg = giaTien;
        this.khoiLuong = khoiLuong;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ten == null) ? 0 : ten.hashCode());
        long temp;
        temp = Double.doubleToLongBits(giaTien1Kg);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(khoiLuong);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HoaDonCaPhe other = (HoaDonCaPhe) obj;
        if (ten == null) {
            if (other.ten != null)
                return false;
        } else if (!ten.equals(other.ten))
            return false;
        if (Double.doubleToLongBits(giaTien1Kg) != Double.doubleToLongBits(other.giaTien1Kg))
            return false;
        if (Double.doubleToLongBits(khoiLuong) != Double.doubleToLongBits(other.khoiLuong))
            return false;
        return true;
    }

    public double tinhTongTien() {
        return this.khoiLuong * this.giaTien1Kg;
    }

    public boolean KTKhoiLuong(double KL) {
        return this.khoiLuong > KL;
    }

    public boolean KTTongTien(double tien) {
        return this.tinhTongTien() > tien;
    }

    public double giamGia(double x) {
        return this.tinhTongTien() > 500000 ? (x / 100 * this.tinhTongTien()) : 0;
    }

    public double soTienPhaiTra(double x) {
        return this.tinhTongTien() - this.giamGia(x);
    }
}
