package vidu;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(5678, "Nguyen Thi C", "Lap trinh web", 9.8);
        SinhVien sv2 = new SinhVien(1234, "Nguyen An B", "Lap trinh web", 9.8);
        SinhVien sv3 = new SinhVien(1234, "Aguyen Van H", "Lap trinh web", 9.8);

        SinhVien[] arrSV = { sv1, sv2, sv3 };

        System.out.println(Arrays.toString(arrSV));
        System.out.println(Arrays.binarySearch(arrSV, sv3));

        Arrays.sort(arrSV);

        System.out.println(Arrays.toString(arrSV));
        System.out.println(Arrays.binarySearch(arrSV, sv3));
    }
}
