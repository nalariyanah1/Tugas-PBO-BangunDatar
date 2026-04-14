package pbo_2407009.TugasBangunDatar;

public class PersegiPanjang extends BangunDatar {
    
    // Constructor dengan 2 parameter
    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar);  // panjang = varA, lebar = varB
    }
    
    @Override
    public double hitungLuas() {
        return getVarA() * getVarB();  // panjang x lebar
    }
    
    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("========================================");
    }
}