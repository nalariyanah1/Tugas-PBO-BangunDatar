package pbo_2407009.TugasBangunDatar;

public class Segitiga extends BangunDatar {
    
    // Constructor dengan 2 parameter
    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi);  // alas = varA, tinggi = varB
    }
    
    @Override
    public double hitungLuas() {
        return 0.5 * getVarA() * getVarB();  // 1/2 x alas x tinggi
    }
    
    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("Alas: " + getVarA());
        System.out.println("Tinggi: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("========================================");
    }
}