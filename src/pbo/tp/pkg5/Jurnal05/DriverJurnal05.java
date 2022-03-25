package pbo.tp.pkg5.Jurnal05;

import pbo.tp.pkg5.TP05.Kordinat;

public class DriverJurnal05 {

    public static void main(String[] args){
        demo();
    }

    static void test(){
        Semut semut = new Semut("hitam", 20, 40);
        System.out.println(semut);

        semut.gerak(30, 50);
        semut.gerak(60, 70);
        System.out.println(semut);

        semut.kembaliKeSarang();
        System.out.println(semut);
    }

    static void demo(){
        Serangga A = new Serangga("merah", 20, 30);
        System.out.println("Posisi awal A: " + A.getPosisi().getX() + ", " + A.getPosisi().getY());
        A.gerak(40, 50);
        System.out.println("Posisi akhir A: " + A.getPosisi().getX() + ", " + A.getPosisi().getY());

        Semut B = new Semut("hitam", 50, 80);
        System.out.println("Sarang B: " + B.getLokasiSarang().getX() + ", " + B.getLokasiSarang().getY());
        System.out.println("Posisi awal B: " + B.getPosisi().getX() + ", " + B.getPosisi().getY());

        System.out.println("Rute B: ");
        if (B.getJumlahRute() == 0) System.out.println("---");
        else for (Kordinat k : B.getRute()){
            System.out.println("     " + k.getX() + ", " + k.getY());
        }

        B.gerak(60, 100);
        B.gerak(70, 120);
        B.gerak(80, 140);

        System.out.println("Rute B: ");
        if (B.getJumlahRute() == 0) System.out.println("---");
        else for (Kordinat k : B.getRute()){
            System.out.println("     " + k.getX() + ", " + k.getY());
        }

        B.kembaliKeSarang();
        System.out.println("Posisi akhir B: " + B.getPosisi().getX() + ", " + B.getPosisi().getY());
        System.out.println("Rute B: ");
        if (B.getJumlahRute() == 0) System.out.println("---");
        else for (Kordinat k : B.getRute()){
            System.out.println("     " + k.getX() + ", " + k.getY());
        }
    }

}
