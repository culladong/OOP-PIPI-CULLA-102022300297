class KomputerGame extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
   protected boolean vipCard;
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerGame (int jumlahkomputer, String namaWarnet, float hargaperjam, boolean vipCard){
        super(jumlahkomputer, namaWarnet, hargaperjam);
        this.vipCard = vipCard;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    public void Informasi(){
        super.Informasi();
        System.out.println("VIP CARD :"+ vipCard);
        }
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String Username){
        System.out.println("Login dengan username : " + Username);
        }
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam){
        System.out.println("Bermain selama :"+ jam);
        }
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int jam, int menitTambahan){
        System.out.println("Nambah biling selama"+jam +"menit tambahan"+ menitTambahan);
        }
}