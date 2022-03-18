public class Parent{
  public int umur = 50;
  public String pekerjaan = "Dokter";

  public Parent(int gaji, int ktp){
    System.out.println("Eksekusi kontruktor kelas inheritance " + gaji);
  }
  
  public void Aktivitas(){
    System.out.println("Kelas parent pergi bekerja");
  }
}