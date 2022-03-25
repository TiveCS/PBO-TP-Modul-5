package pbo.tp.pkg5.Jurnal05;

import pbo.tp.pkg5.TP05.Kordinat;

import java.util.Arrays;

public class Semut extends Serangga{

    private Kordinat lokasiSarang;
    private Kordinat[] rute;
    private int jumlahRute = 0;

    public Semut(String warna, int x, int y) {
        super(warna, x, y);
        this.lokasiSarang = super.getPosisi();
        this.rute = new Kordinat[3];
        this.jumlahRute = 0;
    }

    private void tambahRute(Kordinat kordinat){
        if (getJumlahRute() >= 3) return;
        getRute()[getJumlahRute()] = kordinat;
        setJumlahRute(getJumlahRute() + 1);
    }

    public void kembaliKeSarang(){
        super.gerak(getLokasiSarang().getX(), getLokasiSarang().getY());
        setRute(new Kordinat[3]);
        setJumlahRute(0);
    }

    @Override
    public void gerak(int x, int y) {
        super.gerak(x, y);
        tambahRute(new Kordinat(x, y));
    }

    public void setLokasiSarang(Kordinat lokasiSarang) {
        this.lokasiSarang = lokasiSarang;
    }

    public void setRute(Kordinat[] rute) {
        this.rute = rute;
    }

    public void setJumlahRute(int jumlahRute) {
        this.jumlahRute = jumlahRute;
    }

    public Kordinat getLokasiSarang() {
        return lokasiSarang;
    }

    public Kordinat[] getRute() {
        return rute;
    }

    public int getJumlahRute() {
        return jumlahRute;
    }

    @Override
    public String toString() {
        return "Semut{" +
                "posisi=" + getPosisi() +
                ", lokasiSarang=" + lokasiSarang +
                ", rute=" + Arrays.toString(rute) +
                ", jumlahRute=" + jumlahRute +
                '}';
    }
}
