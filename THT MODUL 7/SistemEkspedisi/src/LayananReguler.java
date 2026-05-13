public class LayananReguler extends LayananEkspedisi {

    public LayananReguler(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    @Override
    public double hitungOngkir() {
        // Tarif dasar Rp 15.000 per Kg (dari Berat Efektif)
        return 15000 * hitungBeratEfektif();
    }

    // Overloading: Menghitung ongkir dengan diskon member dan surcharge jarak
    public double hitungOngkir(boolean isMember, int jarakKm) {
        double tarifDasar = hitungOngkir(); // Ambil tarif dasar
        
        if (isMember) {
            tarifDasar = tarifDasar - (tarifDasar * 0.10); // Diskon 10%
        }
        
        double surcharge = 500 * jarakKm; // Surcharge jarak jauh Rp 500 per km
        return tarifDasar + surcharge;
    }
}