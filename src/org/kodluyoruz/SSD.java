package org.kodluyoruz;

/**
 * Bu sınıf bir SSD'yi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her SSD'nin Hardware sınıfındakilere ek olarak 1 özelliği vardır:
 *      - Hafıza boyutu, GB cinsinden (memory) (int türünde) Örnek: 500 GB, 750 GB vs.
 *
 * TODO Bu özellik ve metotları için gereken kodları bu sınıfın içine yazın
 */
public class SSD extends Hardware
{

    private int memory;

    public SSD(){

    }

    public SSD(String brand, double price, int power, int memory) {
        super(brand, price, power);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    /*
     * Eğer SSD'nin hafızası 750 GB'tan fazlaysa, her 250 GB için fiyatı 275 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */


    @Override
    public void setPrice(double price) {

        double tempPrice = 0;

        if(memory > 750){
            if((memory - 750) % 250 == 0) {
                tempPrice = 0 + ((memory -750)/250)*275;
            } else {
                tempPrice = 0;
            }
        } else {
            tempPrice = 0;
        }

        price = price + tempPrice;

        super.setPrice(price);
    }
}
