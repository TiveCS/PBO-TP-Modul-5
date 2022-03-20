package pbo.tp.pkg5.TP05;

public class Kordinat {

    private int x;
    private int y;

    public Kordinat(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double hitungJarakNonAkar(Kordinat otherKordinat){
        double distanceX = getX() - otherKordinat.getX();
        double distanceY = getY() - otherKordinat.getY();

        return distanceX*distanceX + distanceY*distanceY;
    }

    public double hitungJarak(Kordinat otherKordinat){
        // distance = sqrt((x2 - x1)**2 + (y2 - y1)**2)
        double result;

        result = Math.sqrt(hitungJarakNonAkar(otherKordinat));

        return result;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
