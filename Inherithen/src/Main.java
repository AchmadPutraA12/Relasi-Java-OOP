import class3D.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("pertemuan 5 kelas P - inheritance");
        Prisma balok = new Prisma(5,2,3);
        balok.getVolume();

        Tabung objTabung = new Tabung(1,3);
        objTabung.viewVol();
    }
}
