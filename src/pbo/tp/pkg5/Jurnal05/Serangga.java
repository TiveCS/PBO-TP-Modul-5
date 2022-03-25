package pbo.tp.pkg5.Jurnal05;

import pbo.tp.pkg5.TP05.Kordinat;
import pbo.tp.pkg5.TP05.KordinatWarna;

public class Serangga {

    private final int jumlahKaki = 6;
    private String warna;
    private Kordinat posisi;

    public Serangga(String warna, int x, int y){
        setWarna(warna);
        setPosisi(new KordinatWarna(x, y, warna));
    }

    public void gerak(int x, int y){
        setPosisi(new KordinatWarna(x, y, getWarna()));
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        if (warna == null) return;
        this.warna = warna;
    }

    public Kordinat getPosisi() {
        return posisi;
    }

    public void setPosisi(Kordinat posisi) {
        this.posisi = posisi;
    }

}
