import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
    // private Map<String, String> duLieu = new TreeMap<String, String>();
    private Map<String, String> duLieu = new HashMap<String, String>();

    public void themTuDien(String tuKhoa, String yNghia) {
        this.duLieu.put(tuKhoa, yNghia);
    }

    public void xoaTu(String tuKhoa) {
        this.duLieu.remove(tuKhoa);
    }

    public String traTu(String tuKhoa) {
        return this.duLieu.get(tuKhoa);
    }

    public void inTuKhoa() {
        Set<String> tapHopTuKhoa = this.duLieu.keySet();

        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }

    public int soLuongTuKhoa() {
        return this.duLieu.size();
    }

    public void xoaAll() {
        this.duLieu.clear();
    }
}
