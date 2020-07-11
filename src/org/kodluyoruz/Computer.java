package org.kodluyoruz;

/**
 * Bu sınıf bir bilgisayarı temsil eder.
 * Bilgisayarın beş adet donamımı vardır:
 *      - Anakart
 *      - CPU
 *      - RAM
 *      - SSD
 *      - Ekran kartı
 *
 * TODO Bu alanların getter ve setter metotlarını oluşturun.
 */
public class Computer
{

    private Hardware motherboard;
    private Hardware cpu;
    private Hardware ram;
    /*** SSD * İsteğe bağlı: Her bilgisayarda SSD olmayabilir */
    private Hardware ssd;
    /*** ekran kartı * İsteğe bağlı: Her bilgisayarda ekran kartı olmayabilir */
    private Hardware gpu;

    Computer(){

    }

    public Computer(Hardware motherboard, Hardware cpu, Hardware ram, Hardware ssd, Hardware gpu) {
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.gpu = gpu;
    }

    public Hardware getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Hardware motherboard) {
        this.motherboard = motherboard;
    }

    public Hardware getCpu() {
        return cpu;
    }

    public void setCpu(Hardware cpu) {
        this.cpu = cpu;
    }

    public Hardware getRam() {
        return ram;
    }

    public void setRam(Hardware ram) {
        this.ram = ram;
    }

    public Hardware getSsd() {
        return ssd;
    }

    public void setSsd(Hardware ssd) {
        this.ssd = ssd;
    }

    public Hardware getGpu() {
        return gpu;
    }

    public void setGpu(Hardware gpu) {
        this.gpu = gpu;
    }

    public double getTotalPrice()
    {
        // Bu metot bilgisayarın donanımlarına bakarak toplam fiyatını hesaplar.
        // TODO metodu doldurun
        return cpu.getPrice() + gpu.getPrice() + motherboard.getPrice() + ram.getPrice() + ssd.getPrice();
    }

    public int getTotalPower()
    {
        // Bu metot bilgisayarın donanımlarına bakarak toplamda ne kadar güç tüketeceğini hesaplar.
        // TODO metodu doldurun
        return 0;
    }

}
