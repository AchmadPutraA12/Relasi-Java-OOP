package class3D;
import class2D.*;

public class Tabung extends Lingkaran{
    private int tinggi;

    public Tabung(double jari, int tinggi){
        super.jari = jari;
        this.tinggi = tinggi;
    }
 
    public void viewVol(){
        double volume = super.getLuas()*this.tinggi;
        System.out.println("volume Tabung: "+ volume);
    }
}
