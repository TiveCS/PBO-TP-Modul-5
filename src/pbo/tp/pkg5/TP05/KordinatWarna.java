package pbo.tp.pkg5.TP05;

public class KordinatWarna extends Kordinat {

    private String warna;

    public KordinatWarna(int x, int y, String warna) {
        super(x, y);
        this.warna = warna;
    }

    public String hitungJarak(KordinatWarna otherKordinat) {
        double distance = super.hitungJarak(otherKordinat);

        return getWarna() + " - " + otherKordinat.getWarna() + ": " + distance;
    }

    public String getWarna() {
        return warna;
    }
}
