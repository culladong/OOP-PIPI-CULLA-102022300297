public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan("Hewan Umum", 5);
        Kucing kucing1 = new Kucing("Kitty", 2, "Persia");
        Burung burung1 = new Burung("Tweety", 1, "Kuning");

        hewan1.infoHewan();
        hewan1.suara();
        hewan1.makan("rumput");
        
        System.out.println();

        kucing1.infoHewan();
        kucing1.suara();
        kucing1.makan();

        System.out.println();

        burung1.infoHewan();
        burung1.suara();
        burung1.makan("biji-bijian");
    }
}
