class Main {
  public static void main(String[] args) {
    Child anak       = new Child();
    Parent campur    = new Child();

    System.out.println(anak.umur);
    anak.Aktivitas();

    System.out.println(campur.umur);
    campur.Aktivitas();
  }
}