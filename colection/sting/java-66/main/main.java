package main;

public class main {
    public static void main(String[] args) {
        Box<Integer, Integer> b1 = new Box<>(12, 100);
        System.out.println(b1.getDienTich());

    }

    public <T> void inRa(T value) {
        System.out.println(value);
    }
}
