import java.util.Scanner;

public class Tugas {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    loop: while(true){

      System.out.println();
      System.out.println("Pilih program: ");
      System.out.println("1. Menghitung biaya parkir");
      System.out.println("2. Menghitung gaji dan upah lembur");
      System.out.println("3. Menghitung uang pecahan");
      System.out.println("4. Keluar");
      System.out.print("Pilih menu(1-4): ");

      int menu = input.nextInt();
      clearConsole();

      switch(menu){
        case 1:
          System.out.println("=====MENGHITUNG BIAYA PARKIR=====");
          System.out.print("Masukan jam masuk (0-24): ");
          int jamMasuk = input.nextInt();
      
          System.out.print("Masukan jam keluar (0-24): ");
          int jamKeluar = input.nextInt();
      
          System.out.print("Masukan biaya perjam: ");
          int biayaPerJam = input.nextInt();
      
          int totalBiaya = hitungBiayaParkir(jamMasuk, jamKeluar, biayaPerJam);
          System.out.print("Total biaya parkir: " + totalBiaya);
          break;
        case 2:
          System.out.println("=====MENGHITUNG GAJI UPAH DAN LEMBUR=====");

          System.out.print("Masukan gaji pokok: ");
          int gaji = input.nextInt();
      
          System.out.print("Masukan lama jam lembur: ");
          int jamLembur = input.nextInt();
      
          System.out.print("Masukan upah lembur perjam: ");
          int upahLembur = input.nextInt();
      
          int totalGaji = hitungGajiLembur(gaji, jamLembur, upahLembur);
          System.out.print("Total gaji yang diterima: " + totalGaji);
          break;
        case 3:
          System.out.println("=====MENGHITUNG UANG PECAHAN=====");

          System.out.print("Masukan nominal uang: ");
          int nominal = input.nextInt();

          int[] lembar = hitungPecahanUang(nominal);
          
          for (int i = 0;i < lembar.length; i++){
            int jumlahLembar = lembar[i];

            if (jumlahLembar == 0) continue;

            switch(i){
              case 0:
                System.out.println(jumlahLembar + " lembar seratus ribuan");
                break;
              case 1:
                System.out.println(jumlahLembar + " lembar lima puluh ribuan");
                break;
              case 2:
                System.out.println(jumlahLembar + " lembar dua puluh ribuan");
                break;
              case 3:
                System.out.println(jumlahLembar + " lembar sepuluh ribuan");
                break;
              case 4:
                System.out.println(jumlahLembar + " lembar lima ribuan");
                break;
              case 5:
                System.out.println(jumlahLembar + " lembar dua ribuan");
                break;
              case 6:
                System.out.println(jumlahLembar + " lembar seribuan");
                break;
              case 7:
                System.out.println(jumlahLembar + " keping lima ratusan perak");
                break;
              case 8:
                System.out.println(jumlahLembar + " keping dua ratusan perak");
                break;
              case 9:
                System.out.println(jumlahLembar + " keping seratusan perak");
                break;
              case 10:
                System.out.println("Sisa: " + jumlahLembar);
                break;
            }
          }

          break;
        case 4:
          input.close();
          break loop;
      }
    };
  }

  private static int hitungBiayaParkir(int jamMasuk, int jamKeluar, int biayaPerJam){
    int lamaParkir = jamKeluar - jamMasuk;

    if (jamMasuk > jamKeluar){
      lamaParkir = 24 - (jamMasuk - jamKeluar);
    }    

    int biaya = lamaParkir * biayaPerJam;

    return biaya;
  }

  private static int hitungGajiLembur(int gaji, int jamLembur, int upahLembur){
    return gaji + (jamLembur * upahLembur);
  }

  private static int[] hitungPecahanUang(int nominal){
    int ratusRibu = nominal / 100000;
    int sisa = nominal % 100000;

    int limaPuluhRibu = sisa / 50000;
    sisa = sisa % 50000;

    int duaPuluhRibu = sisa / 20000;
    sisa = sisa % 20000;

    int sepuluhRibu = sisa / 10000;
    sisa = sisa % 10000;

    int limaRibu = sisa / 5000;
    sisa = sisa % 5000;

    int duaRibu = sisa / 2000;
    sisa = sisa % 2000;

    int seribu = sisa / 1000;
    sisa = sisa % 1000;

    int keping500 = sisa / 500;
    sisa = sisa % 500;

    int keping200 = sisa / 200;
    sisa = sisa % 200;

    int keping100 = sisa / 100;
    sisa = sisa % 100;

    int[] lembar = {
      ratusRibu,
      limaPuluhRibu,
      duaPuluhRibu,
      sepuluhRibu,
      limaRibu,
      duaRibu,
      seribu,
      keping500,
      keping200,
      keping100,
      sisa
    };

    return lembar;
  }

  public final static void clearConsole()  {
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
  }  
}
