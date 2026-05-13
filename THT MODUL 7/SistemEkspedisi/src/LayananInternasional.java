public class LayananInternasional extends LayananEkspedisi {
    private String negaraTujuan;
    private double nilaiBarangUSD;

    public LayananInternasional(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
        this.negaraTujuan = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }

    @Override
    public double hitungOngkir() {
        double tarifDasar = 200000 * hitungBeratEfektif();
        double pajak = 0.0;
        
        // Pajak 20% jika nilai barang > 50 USD
        if (nilaiBarangUSD > 50) {
            pajak = 0.20 * tarifDasar;
        }
        
        return tarifDasar + pajak;
    }

    // Metode spesifik cetak manifest
    public void cetakManifest() {
        System.out.println("Manifest Internasional ke " + negaraTujuan + " - Deklarasi Nilai: $" + nilaiBarangUSD);
    }
}