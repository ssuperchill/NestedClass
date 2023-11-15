import java.text.NumberFormat;
import java.util.Locale;

public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }

    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // Inner class Harddisk
    public class Harddisk {
        int kapasitas;
        String manufacturer;

        Harddisk(int kapasitas, String manufacturer) {
            this.kapasitas = kapasitas;
            this.manufacturer = manufacturer;
        }

        public void getInfoHarddisk() {
            System.out.println("Kapasitas Harddisk: " + this.kapasitas + " GB");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // Inner class Motherboard
    public class Motherboard {
        String model;
        String manufacturer;

        Motherboard(String model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }

        public void getInfoMotherboard() {
            System.out.println("Model Motherboard: " + this.model);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // Inner class PowerSupply
    public class PowerSupply {
        String model;
        String manufacturer;

        PowerSupply(String model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }

        public void getInfoPowerSupply() {
            System.out.println("Model Power Supply: " + this.model);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // Inner class VGACard
    public class VGACard {
        String model;
        String manufacturer;

        VGACard(String model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }

        public void getInfoVGACard() {
            System.out.println("Model VGA Card: " + this.model);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }
}