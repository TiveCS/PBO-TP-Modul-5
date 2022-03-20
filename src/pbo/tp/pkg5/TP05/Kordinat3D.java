package pbo.tp.pkg5.TP05;

public class Kordinat3D extends Kordinat{

    private int z;

    public Kordinat3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public double hitungJarakNonAkar(Kordinat3D otherKordinat) {
        double distanceZ = getZ() - otherKordinat.getZ();
        return super.hitungJarakNonAkar(otherKordinat) + (distanceZ*distanceZ);
    }

    public double hitungJarak(Kordinat3D otherKordinat) {
        return Math.sqrt(hitungJarakNonAkar(otherKordinat));
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

}
