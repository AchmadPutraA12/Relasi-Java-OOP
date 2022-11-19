public class Main {
    public static void main(String[]args) {
		System.out.println("pertemuan 3");

        persegi_panjang ppPanjang = new persegi_panjang(5, 3);
		voulmeBangunan objekBalok = new voulmeBangunan(ppPanjang,3);
		objekBalok.print_volume();
	}
}
