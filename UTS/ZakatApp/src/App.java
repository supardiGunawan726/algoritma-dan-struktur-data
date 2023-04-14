import java.io.Console;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Console console = System.console();
        ArrayList<Zakat> dataZakat = new ArrayList<>();
        ArrayList<Sedekah> dataSedekah = new ArrayList<>();

        while(true){
            System.out.println("================================");
            System.out.println("APLIKASI ZAKAT DAN SEDEKAH");
            System.out.println("================================");
            System.out.println("MENU:");
            System.out.println("1. Input zakat fitri");
            System.out.println("2. Input sedekah");
            System.out.println("3. Tampilkan data");
            System.out.println("4. Keluar");

            int menu = Integer.parseInt(console.readLine("silahkan masukan menu (1-4): "));

            if (menu == 4) break;

            switch(menu){
                case 1:
                    System.out.println("==============Input Zakat===============");
                    String nama = console.readLine("Nama: ");

                    String menuTipeZakat;
                    do{
                        System.out.println("Tipe zakat: ");
                        System.out.println("1. Beras 2,5KG");
                        System.out.println("2. Uang 35.000");
                        menuTipeZakat = console.readLine("Masukan tipe zakat (1/2): ");
                    }while(!menuTipeZakat.equals("1") && !menuTipeZakat.equals("2"));


                    dataZakat.add(new Zakat(nama, menuTipeZakat.equals("1") ? "beras" : "uang"));

                    if (console.readLine("Sekalian input sedekah (ya/tidak)? ").equals("ya")){
                        double nominal = Double.parseDouble(console.readLine("Masukan nominal uang sedekah: "));
                        dataSedekah.add(new Sedekah(nama, nominal));
                    }
                    break;
                case 2:
                    System.out.println("==============Input Sedekah===============");
                    nama = console.readLine("Nama: ");
                    double nominal = Double.parseDouble(console.readLine("Masukan nominal uang: "));
                    dataSedekah.add(new Sedekah(nama, nominal));
                    break;
                case 3:

                    int jumlahWargaZakatBeras = 0;
                    double totalZakatBeras = 0;

                    int jumlahWargaZakatUang = 0;
                    double totalZakatUang = 0;

                    for (Zakat zakat: dataZakat){
                        if (zakat.jenisZakat == "beras"){
                            jumlahWargaZakatBeras++;
                            totalZakatBeras += zakat.getZakatBeras();
                        }else {
                            jumlahWargaZakatUang++;
                            totalZakatUang += zakat.getZakatUang();
                        }
                    }

                    double totalSedekah = 0;
                    for (Sedekah sedekah: dataSedekah){
                        totalSedekah+= sedekah.nominal;
                    }

                    System.out.println("==============Data zakat dan sedekah===============");
                    System.out.println("Total banyak warga yang membayar zakat fitri: " + dataZakat.size() + " orang");
                    System.out.println("banyak warga yang membayar zakat fitri beras: " + jumlahWargaZakatBeras + " orang");
                    System.out.println("banyak warga yang membayar zakat fitri uang: " + jumlahWargaZakatUang + " orang");
                    System.out.println("Total zakat beras yang terkumpul: " + totalZakatBeras + " Kg");
                    System.out.println("Total zakat uang yang terkumpul: " + totalZakatUang + " Rupiah");
                    System.out.println("Total sedekah yang terkumpul: " + totalSedekah + " Rupiah");
                    break;
                default:
                    System.out.println("Mohon masukan menu 1-4");
                    break;
            }
        }
    }
}
