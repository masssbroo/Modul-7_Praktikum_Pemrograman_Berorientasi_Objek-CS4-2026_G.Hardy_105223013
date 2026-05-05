public class KartuKredit extends MetodePembayaran {
    // Overriding: Mengubah pesan bayar untuk kartu kredit
    @Override
    public void bayar(double nominal) {
        System.out.println("Mencetak tagihan Kartu Kredit sebesar Rp" + nominal + "...");
    }

    // Metode spesifik: Hanya ada di KartuKredit
    public void verifikasiPIN() {
        System.out.println("Memverifikasi PIN Kartu Kredit... BERHASIL!");
    }
}