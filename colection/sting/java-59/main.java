public class main {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb1 = new ThoiKhoaBieu(Day.Monday, "Toan, ly, hoa");
        ThoiKhoaBieu tkb2 = new ThoiKhoaBieu(Day.Tuesday, "Van, su, dia");
        ThoiKhoaBieu tkb3 = new ThoiKhoaBieu(Day.wednesday, "Ve, the duc, am nhac");
        ThoiKhoaBieu tkb4 = new ThoiKhoaBieu(Day.Thursday, "Tin, GDCD, tin");

        System.out.println(tkb1);

        System.out.println(Day.Sunday.ordinal());
    }
}
