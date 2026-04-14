package pbo_2407009.TugasBangunDatar;

public class Persegi extends BangunDatar {
    
    // Constructor sesuai kebutuhan
    public Persegi(double sisi) {
        super(sisi);  // sisi disimpan ke varA
    }
    
    // Override method hitungLuas
    @Override
    public double hitungLuas() {
        return getVarA() * getVarA();  // sisi x sisi
    }
    
    // Override method tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("Sisi: " + getVarA());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("========================================");
    }
}