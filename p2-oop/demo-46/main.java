import java.util.Arrays;

import MayTinh.*;
import SapXep.SapXepChen;
import SapXep.SapXepChon;
import SapXep.SapXepInterface;

public class main {
    public static void main(String[] args) {
        MayTinhBoTui may1 = new MayTinhVinaCol500();
        MayTinhBoTui may2 = new MayTinhCasioFX500();

        System.out.println(may1.cong(5, 10));
        System.out.println(may2.cong(100, 1323));

        double[] arr1 = { 4, 6, 1, 3, 7, 8, 2, 5 };
        double[] arr2 = { 7, 3, 4, 8, 9, 0, 1, 2, 5 };
        SapXep.SapXepInterface chen = new SapXep.SapXepChon();
        SapXep.SapXepInterface chon = new SapXep.SapXepChon();

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        PhanMemMayTinh pm1 = new PhanMemMayTinh();

        System.out.println(pm1.nhan(10, 19));
        pm1.sapXepGiam(arr1);
        pm1.sapXepGiam(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
