import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arrCopy = arr;
        int[] arrCopy2 = new int[arr.length];
        int[] arrCoppy3 = arr.clone();
        System.arraycopy(arr, 2, arrCopy2, 1, 3);
        arrCopy[0] = 0;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrCopy2));
        System.out.println(Arrays.toString(arrCoppy3));

        String[] str = { "a", "b", new String("123") };
        String[] strCopy = str;
        String[] strCopy2 = str.clone();
        String[] strCopy3 = new String[str.length];
        System.arraycopy(str, 0, strCopy3, 0, str.length);

        strCopy[0] = "123";
        strCopy3[2] = new String("y");

        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(strCopy2));
        System.out.println(Arrays.toString(strCopy3));
    }
}
