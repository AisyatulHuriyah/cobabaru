package Interface;

//baca nya dari sini ya, karna smartband kan parentclass nya, terus nantike casualband

// CATATAN: Kata kunci 'abstract' artinya ini class setengah jadi.
// Kita GAK BISA bikin objek langsung dari class ini (gak boleh: new SmartBand()).
public abstract class SmartBand {
    
    // CATATAN: Atribut biasa. Tanda '+' di UML artinya Public (bisa diakses dari mana aja).
    // Karena ini class induk, anak-anaknya nanti bakal mewarisi variabel ini.
    public String brandName;
    public int batteryLevel;

    // CATATAN: Abstract class BOLEH punya Constructor (beda sama Interface).
    // Constructor ini nanti dipanggil sama class anak pakai perintah 'super()'.
    public SmartBand(String brandName, int batteryLevel) {
        this.brandName = brandName;
        this.batteryLevel = batteryLevel;
    }

    // CATATAN: Ini namanya method KONKRET (udah ada isi/logikanya).
    // Kita taruh logika display di sini biar class anak gak perlu nulis ulang kodenya (hemat).
    public void displayInfo() {
        System.out.println("Brand: " + brandName);
        System.out.println("Battery: " + batteryLevel + "%");
    }

    // CATATAN: Method konkret lagi. Semua SmartBand pasti bisa sinkronisasi data.
    public void syncData() {
        System.out.println("Menyinkronkan data " + brandName + "...");
    }
}