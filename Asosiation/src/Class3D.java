class voulmeBangunan{
    private int panjang;
    private int lebar;
    private int tinggi;

    public voulmeBangunan(int p, int l, int t)
    {
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }

    public void print_volume()
    {
        double volume = this.panjang*this.lebar*this.tinggi;
        System.out.println("volume = "+volume);
    }
}