import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Buat ArrayList (Upcasting)
        ArrayList<LayananEkspedisi> listLayanan = new ArrayList<>();

        // 2. Tambahkan data sesuai spesifikasi
        listLayanan.add(new LayananReguler("REG-11", 2, 50, 50, 50));
        listLayanan.add(new LayananExpress("EXP-22", 5, 10, 10, 10));
        listLayanan.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100));

        // 3. Variabel total pendapatan
        double totalPendapatanPerusahaan = 0.0;

        System.out.println("=== DETAIL LAYANAN EKSPEDISI ===");

        // 4. Perulangan menelusuri koleksi
        for (LayananEkspedisi layanan : listLayanan) {
            System.out.println("-------------------------------------------------");

            // Panggil cetakResi
            layanan.cetakResi();

            // Tambahkan ongkir dasar ke total pendapatan
            totalPendapatanPerusahaan += layanan.hitungOngkir();

            // 5. Gunakan instanceof dan Downcasting untuk method spesifik
            if (layanan instanceof LayananReguler) {
                LayananReguler reg = (LayananReguler) layanan;
                System.out.println("Harga Layanan Reguler (Member + Jarak 25Km): Rp " + reg.hitungOngkir(true, 25));
            } else if (layanan instanceof LayananExpress) {
                LayananExpress exp = (LayananExpress) layanan;
                exp.klaimAsuransi(1500000);
            } else if (layanan instanceof LayananInternasional) {
                LayananInternasional intl = (LayananInternasional) layanan;
                intl.cetakManifest();
            }
        }

        System.out.println("=================================================");
        // 6. Cetak total pendapatan di akhir
        System.out.println("Total Pendapatan Perusahaan (Ongkir Dasar): Rp " + totalPendapatanPerusahaan);
    }
}