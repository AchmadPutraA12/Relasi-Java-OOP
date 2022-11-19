class voulmeBangunan{
    private persegi_panjang PP;
    private int tinggi;

    public voulmeBangunan(persegi_panjang pp,int t)
    {
        this.PP = pp;
        this.tinggi = t;
    }

    public void print_volume()
    {
        double volume = this.PP.getLuasAlas()*this.tinggi;
        System.out.println("volume = "+volume);
    }
}