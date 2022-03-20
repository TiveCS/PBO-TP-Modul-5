/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.tp.pkg5.TP05;

/**
 *
 * @author Fathan
 */
public class DriverTP05 {

    public static void main(String[] args) {

        Kordinat A = new Kordinat(15, 12);
        Kordinat3D B = new Kordinat3D(10, 28, 30);
        System.out.println("A - B: " + A.hitungJarak(B));

        Kordinat3D C = new Kordinat3D(11, 26, 32);
        System.out.println("B - C: " + B.hitungJarak(C));

        KordinatWarna D = new KordinatWarna(35, 60, "hitam"), E = new KordinatWarna(25, 50, "putih");
        System.out.println(D.hitungJarak(E));
    }
    
}
