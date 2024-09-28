public enum PhanLoai {
    Gioi(12),
    Kha(12),
    TB(12),
    Yeu(12),
    DuoiHoc(12);

    private int getDiem;

    PhanLoai(int getDiem) {
        this.getDiem = getDiem;
    }

    public int getDiem() {
        return getDiem;
    }
}
