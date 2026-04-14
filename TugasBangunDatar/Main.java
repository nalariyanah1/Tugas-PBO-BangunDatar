package pbo_2407009.TugasBangunDatar;

public class Main {
    public static void main(String[] args) {
        
        // POLIMORFISME: satu tipe variabel (BangunDatar) untuk menyimpan berbagai objek
        BangunDatar[] daftarBangunDatar = new BangunDatar[3];
        
        // Mengisi array dengan objek yang berbeda
        daftarBangunDatar[0] = new Persegi(5.0);           // Persegi dengan sisi 5
        daftarBangunDatar[1] = new PersegiPanjang(4.0, 6.0); // Persegi Panjang 4x6
        daftarBangunDatar[2] = new Segitiga(3.0, 8.0);      // Segitiga alas 3 tinggi 8
        
        // Perulangan untuk menampilkan semua bangun datar
        for (int i = 0; i < daftarBangunDatar.length; i++) {
            daftarBangunDatar[i].tampilkan();  // Method yang dipanggil sesuai objek aslinya
        }
        
        // Cara lain menggunakan for-each
        // for (BangunDatar b : daftarBangunDatar) {
        //     b.tampilkan();
        // }
    }
}