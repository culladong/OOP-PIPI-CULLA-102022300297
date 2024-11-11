class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected String warnawarnet;
    protected int jumlahkomputer;
    protected float hargaperjam;
    // To do: Buatlah constructor pada class Komputer
   public Komputer (int jumlahkomputer, String warnawarnet, float hargaperjam){
    this.jumlahkomputer = jumlahkomputer;
    this.warnawarnet = warnawarnet;
    this.hargaperjam = hargaperjam;
   } 
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    public void Informasi(){
        System.out.println("jumlah komputer : "+ jumlahkomputer +"warna warnet : "+ warnawarnet +"harga perjam"+ hargaperjam);
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

}