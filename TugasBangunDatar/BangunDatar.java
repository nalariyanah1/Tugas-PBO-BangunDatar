package pbo_2407009.TugasBangunDatar;

public class BangunDatar {
    // Encapsulation: atribut private
    private double varA;
    private double varB;

    // Constructor dengan 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor dengan 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0.0;
    }

    // Getter untuk varA (karena private)
    public double getVarA() {
        return varA;
    }

    // Getter untuk varB
    public double getVarB() {
        return varB;
    }

    // Setter jika diperlukan (opsional)
    public void setVarA(double varA) {
        this.varA = varA;
    }

    public void setVarB(double varB) {
        this.varB = varB;
    }

    // Method hitungLuas dengan nilai default 0
    public double hitungLuas() {
        return 0.0;
    }

    // Method tampilkan sesuai output yang diminta
    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("========================================");
    }
}