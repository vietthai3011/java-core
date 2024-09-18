public class ConNguoi {
    private String ten;
    private int namSinh;

    public ConNguoi(String ten, int namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }

    {
        System.out.println("1 person creat");
    }

    public void an() {
        System.out.println("an");
    }

    public void ngu() {
        System.out.println("ngu");
    }

    public void uong() {
        System.out.println("uong");
    }
}
