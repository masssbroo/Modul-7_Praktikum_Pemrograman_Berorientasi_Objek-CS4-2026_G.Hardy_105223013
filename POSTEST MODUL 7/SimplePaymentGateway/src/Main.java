import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList bertipe Superclass (Konsep Upcasting)
        ArrayList<MetodePembayaran> daftarPembayaran = new ArrayList<>();

        // Memasukkan objek EWallet dan KartuKredit ke dalam array
        daftarPembayaran.add(new EWallet());
        daftarPembayaran.add(new KartuKredit());

        System.out.println("=== SIMULASI PEMBAYARAN ===");

        // Menggunakan perulangan (looping) untuk menelusuri array
        for (MetodePembayaran mp : daftarPembayaran) {
            
            // Panggil metode bayar(100000) -> Demonstrasi Runtime Polymorphism
            // Java akan tahu metode mana yang harus dipanggil saat runtime
            mp.bayar(100000);

            // Menggunakan operator instanceof untuk mengecek tipe objek
            if (mp instanceof EWallet) {
                // Downcasting untuk memanggil metode overload (EWallet)
                ((EWallet) mp).bayar(100000, "081234567890");
            } 
            else if (mp instanceof KartuKredit) {
                // Downcasting untuk memanggil metode verifikasi (KartuKredit)
                ((KartuKredit) mp).verifikasiPIN();
            }

            System.out.println("------------------------------------------");
        }
    }
}