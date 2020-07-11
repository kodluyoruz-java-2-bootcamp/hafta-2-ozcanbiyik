package org.kodluyoruz;

/**
 * Bu sınıf bir RAM'i temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her RAM'in Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Hafıza boyutu (memory) (int türünde) Örnek: 8 GB, 16 GB vs.
 *      - Frekansı (frequency) (int türünde) Örnek: 3200 MHz, 3600 Mhz vs.
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class RAM extends Hardware
{

    private int memory;
    private int frequency;

    public RAM(){

    }

    public RAM(String brand, double price, int power, int memory, int frequency) {
        super(brand, price, power);
        this.memory = memory;
        this.frequency = frequency;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    /*
     * Eğer RAM'in hafızası 16 GB'tan fazlaysa, her 4 GB için fiyatı 100 TL artar.
     * Eğer RAM'in frekansı 3600 MHz'den fazlaysa, her 400 MHz için fiyatı 200 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    @Override
    public void setPrice(double price) {

        double tempPrice1 = 0;
        double tempPrice2 = 0;

        if (memory > 16){
            if ((memory - 16) % 4 == 0 ){
                tempPrice1 = 0 + ((memory-16)/4) * 100;
            } else {
                tempPrice1 = 0;
            }
        } else {
            tempPrice1 = 0;
        }

        if (frequency > 3600) {
            if((frequency - 3600) % 400 == 0){
                tempPrice2 = 0 + ((frequency-3600)/400) * 200;
            } else {
                tempPrice2 = 0;
            }
        } else {
            tempPrice2 = 0;
        }

        price = price + tempPrice1 + tempPrice2;

        super.setPrice(price);
    }
}
