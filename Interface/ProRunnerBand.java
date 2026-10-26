package Interface;

//habis dari pro runner band ke sini, terus ke elite runner band

// CATATAN: Dia cuma mewarisi (extends) SmartBand. 
// Gak pakai implements interface apa pun.
public class ProRunnerBand extends SmartBand {

    public ProRunnerBand(String brandName, int batteryLevel) {
        super(brandName, batteryLevel); // Panggil constructor induk
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Pro Runner Band ===");
        System.out.println("Brand: " + brandName + " | Battery: " + batteryLevel + "%");
    }

    // CATATAN: Ini method baru, gak ada di induk, gak ada di interface mana pun.
    // Khusus buat ProRunnerBand dan turunannya (EliteRunnerBand).
    public void trackHeartRate() {
        System.out.println("Memantau detak jantung (Pro Runner)...");
    }

    // CATATAN: Ini method hitung pace. Return-nya angka desimal (double).
    public double calculatePace(double distanceKm, int durationMinutes) {
        if (distanceKm == 0) return 0; // Biar gak error bagi nol
        return durationMinutes / distanceKm;
    }
}