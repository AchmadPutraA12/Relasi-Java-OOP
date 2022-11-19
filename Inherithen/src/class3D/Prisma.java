package class3D;
import class2D.*;

public class Prisma extends Persegipanjang{
    final private int tinggi;

    public Prisma(int p, int l, int t){
        super.panjang = p;
        super.lebar = l;
        this.tinggi = t;
    }

    public void getVolume(){
        System.out.println("volume : "+super.getLuas()*this.tinggi);
    }
}
