public class Zakat {
  String nama;
  String jenisZakat;

  final private int BANYAK_ZAKAT_UANG = 35_000; // RUPIAH
  final private double BANYAK_ZAKAT_BERAS = 2.5; // KG

  public Zakat(String nama, String jenisZakat){
    if (jenisZakat == "beras" || jenisZakat == "uang"){
      this.nama = nama;
      this.jenisZakat = jenisZakat;
      return;
    }

    throw new Error("Zakat harus berupa beras 2,5kg atau uang Rp.35.000");
  }

  public int getZakatUang(){
    return BANYAK_ZAKAT_UANG;
  }

  public double getZakatBeras(){
    return BANYAK_ZAKAT_BERAS;
  }
}
