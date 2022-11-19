class voulmeBangunan{
    private persegi_panjang PP;
    private int tinggi;

    public voulmeBangunan(int p, int l, int t)
    {
        this.PP = new persegi_panjang(p,l);
        this.tinggi = t;
    }

    public void print_volume()
    {
        double volume = this.PP.getLuasAlas()*this.tinggi;
        System.out.println("volume = "+volume);
    }
}