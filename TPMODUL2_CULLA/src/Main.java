public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan("Hewan Umum", 5);
        Kucing kucing = new Kucing("Asep", 2, "Persia");
        Burung burung = new Burung("Entong", 1, "Kuning");

        // Menampilkan informasi dan suara dari tiap hewan
        hewan.infoHewan();
        hewan.suara();
        hewan.makan("rumput");
        
        System.out.println();

        kucing.infoHewan();
        kucing.suara();
        kucing.makan();

        System.out.println();

        burung.infoHewan();
        burung.suara();
        burung.makan("biji-bijian");
    }
}