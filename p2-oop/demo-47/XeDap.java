class Xe {
    Xe() {
        System.out.println("Xe được tạo");
    }
}

class XeDap extends Xe {
    XeDap() {
        System.out.println("Xe đạp được tạo");
    }

    public static void main(String args[]) {
        XeDap b = new XeDap();
    }
}