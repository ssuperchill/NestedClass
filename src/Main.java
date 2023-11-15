public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        // buat object Harddisk, Motherboard, PowerSupply, dan VGACard
        CPU.Harddisk hd1TB = myKomputer.new Harddisk(1000, "Seagate");
        CPU.Motherboard mb = myKomputer.new Motherboard("ABC123", "ASUS");
        CPU.PowerSupply psu = myKomputer.new PowerSupply("500W", "Corsair");
        CPU.VGACard vga = myKomputer.new VGACard("GTX 1080", "NVIDIA");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();
        hd1TB.getInfoHarddisk();
        mb.getInfoMotherboard();
        psu.getInfoPowerSupply();
        vga.getInfoVGACard();
    }
}