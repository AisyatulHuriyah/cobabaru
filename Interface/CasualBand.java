package Interface;

// habis smarband, ke sini casual band. terus ke pro runner band

// CATATAN: Ini class nyata (bisa di-new).
// EXTENDS = mewarisi sifat dari class SmartBand (dapet brandName, batteryLevel, dll).
// IMPLEMENTS = menandatangani kontrak dengan HeartRateMonitor. 
// Sesuai PPT Hal 12: Kalau ada extends dan implements, EXTENDS harus di depan!
public class CasualBand extends SmartBand implements HeartRateMonitor {

    // CATATAN: Constructor anak. Parameter diteruskan ke induk pakai 'super()'.
    public CasualBand(String brandName, int batteryLevel) {
        super(brandName, batteryLevel);
    }

    // CATATAN: @Override artinya kita menimpa method displayInfo() milik induk (SmartBand).
    // Kita bikin tampilannya khusus buat CasualBand.
    @Override
    public void displayInfo() {
        System.out.println("=== Casual Band ===");
        System.out.println("Brand: " + brandName + " | Battery: " + batteryLevel + "%");
    }

    // CATATAN: Kita timpa method syncData() punya induk.
    @Override
    public void syncData() {
        System.out.println("Menyinkronkan data Casual Band...");
    }

    // CATATAN: INI YANG PALING PENTING! 
    // Ini adalah wujud nyata dari kontrak HeartRateMonitor.
    // Di interface cuma ada deklarasi, di sini kita kasih logika (System.out.println).
    @Override
    public void trackHeartRate() {
        System.out.println("Memantau detak jantung (Casual)...");
    }
}