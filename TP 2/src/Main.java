public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan("Hewan Umum", 5);
        Kucing kucing = new Kucing("Kitty", 2, "Persia");
        Burung burung = new Burung("Tweety", 1, "Kuning");

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
