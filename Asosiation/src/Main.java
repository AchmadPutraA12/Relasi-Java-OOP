public class Main{
	public static void main(String[]args) {
		System.out.println("pertemuan 2");
        persegi_panjang PP = new persegi_panjang(2, 3);
        PP.view();
		voulmeBangunan objekBalok = new voulmeBangunan(PP.getPanjang(),PP.getLebar(),4);
		objekBalok.print_volume();
	}
}