
package vidu;

import java.util.Arrays;

public class test {

    public static void revert(int[] arr) {
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i >= j)
                return;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            j--;
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 8, 2, 5, 4, 6, 3, 9, 0, 7 };
        int[] b = new int[15];

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.binarySearch(a, 9));

        Arrays.sort(a);
        test.revert(a);

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.binarySearch(a, 9));
    }
}
