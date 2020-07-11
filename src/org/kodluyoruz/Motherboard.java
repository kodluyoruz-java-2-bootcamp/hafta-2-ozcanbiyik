package org.kodluyoruz;

/**
 * Bu sınıf bir anakartı temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her anakartın Hardware sınıfındakilere ek olarak 3 özelliği vardır:
 *      - İşlemci mimarisi, yani hangi marka işlemcilere uygun olduğu (cpuArchitect) (String türünde) Örnek: AMD veya Intel
 *      - WiFi olup olmadığı (wifiIncluded) (boolean türünde)
 *      - Bluetooth olup olmadığı (bluetoothIncluded) (boolean türünde)
 *
 * TODO Bu 3 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class Motherboard extends Hardware
{

    private String cpuArchitect;
    private boolean wifiIncluded;
    private boolean bluetoothIncluded;

    public Motherboard(){

    }

    public Motherboard(String brand, double price, int power, String cpuArchitect, boolean wifiIncluded, boolean bluetoothIncluded) {
        super(brand, price, power);
        this.cpuArchitect = cpuArchitect;
        this.wifiIncluded = wifiIncluded;
        this.bluetoothIncluded = bluetoothIncluded;
    }

    public String getCpuArchitect() {
        return cpuArchitect;
    }

    public void setCpuArchitect(String cpuArchitect) {
        this.cpuArchitect = cpuArchitect;
    }

    public boolean isWifiIncluded() {
        return wifiIncluded;
    }

    public void setWifiIncluded(boolean wifiIncluded) {
        this.wifiIncluded = wifiIncluded;
    }

    public boolean isBluetoothIncluded() {
        return bluetoothIncluded;
    }

    public void setBluetoothIncluded(boolean bluetoothIncluded) {
        this.bluetoothIncluded = bluetoothIncluded;
    }

    /*
     * Eğer anakartın üzerinde WiFi chipset'i varsa anakartın fiyatı 250 TL artar.
     * Eğer anakartın üzerinde bluetooth chipset'i varsa anakartın fiyatı 100 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */


    @Override
    public void setPrice(double price) {

        double tempPrice1 = 0;
        double tempPrice2 = 0;

        if(wifiIncluded == true) {
            tempPrice1 = 0 + 250;
        } else {
            tempPrice1 = 0;
        }
        if (bluetoothIncluded == true) {
            tempPrice2 = 0 + 100;
        } else {
            tempPrice2 = 0;
        }

        price = price + tempPrice1 + tempPrice2;

        super.setPrice(price);

    }
}
