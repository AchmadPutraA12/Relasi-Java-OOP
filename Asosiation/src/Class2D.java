class persegi_panjang{
    private int panjang;
    private int lebar;

    public persegi_panjang(int p, int l){
        this.panjang = p;
        this.lebar = l;
    }

    public int getPanjang() {
        return this.panjang;
    }

    public int getLebar() {
        return this.lebar;
    }

    public int getLuasAlas()
    {
        return this.panjang * this.lebar;
    }

    public void view(){
        System.out.println("Luas Persegi Panjang = " + getLuasAlas());
    }
}

class lingkaran{
    private int jari;
    private double pi = 3.14;

    public void set_lingkaran(int r){
        this.jari = r;
        double luas_lingkaran = pi * r * r;
        System.out.println("Luas Lingkaran : " + luas_lingkaran);
    }
}

class segitiga{
    int alas;
    int tinggi;

    public void set_segitiga(int a, int t){
        this.alas = a;
        this.tinggi = t;
        double luas_segitiga = a * t / 2;
        System.out.println("Luas Segitiga : " + luas_segitiga);
    }
}

class persegi{
    private int sisi;

    public void set_persegi(int s){
        this.sisi = s;
        int luas_persegi = s * s * s * s;
        System.out.println("Luas Persegi : " + luas_persegi);
    }
}


public class Class2D{

}