    class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangprivat;
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium (int jumlahkomputer, String namaWarnet, float hargaperjam, boolean ruangprivat){
        super(jumlahkomputer, namaWarnet, hargaperjam);
        this.ruangprivat = ruangprivat;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    public void Informasi(){
    super.Informasi();
    if (ruangprivat){
        System.out.println("Fasilitas Ruang Komputer:");
        System.out.println("- Ruangan Gerah");
        System.out.println("- sofa majapahit");
        System.out.println("- komputer spesifikasi rendah");
        System.out.println("- koneksi internet dedicated 1 Mbps");
    }
    }
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorkomputer){
        System.out.println("nomor komputer : " + nomorkomputer);
        }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan){
        System.out.println("makanan : "+ makanan);
        }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman){
        System.out.println("makanan :"+ makanan +"minuman :" + minuman);
        }
}
