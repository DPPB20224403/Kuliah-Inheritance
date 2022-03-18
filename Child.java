public class Child extends Parent{
  public int gaji = 10000;

  public Child(){
    super(15000000, 1234);
    System.out.println("Ini adalah konstruktor");
  }

  public Child(int umur){
    super(15000000, 1234);
    System.out.println("Ini adalah konstruktor kedua dengan overloading method : " + umur);
  }

  public Child(String nama){
    super(15000000, 1234);
    System.out.println("Ini adalah konstruktor ketiga dengan overloading method : " + nama);
  }

  public void cekPekerjaanOrangTua(){
    System.out.println("Pekerjaan orang tua adalah : " + super.pekerjaan);
    super.Aktivitas();
  }
  
  @Override
  public void Aktivitas(){
    System.out.println("pergi ke sekolah dari kelas Child");
  }
}