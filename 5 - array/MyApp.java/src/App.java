public class App {
    public static void main(String[] args) {
        System.out.println();
        
        int[] bilangan = new int[3];
        bilangan[0] = 1;
        bilangan[1] = 2;
        bilangan[2] = 3;

        for (int i = 0; i < bilangan.length; i++){
            System.out.print(bilangan[i] + " ");
        }

        int[] bil = {1,5,7,9,11,14,16,18,20};

        System.out.println();
        for (int i = 0; i < bil.length; i++){
            System.out.print(bil[i] + " ");
        }

        String[] mahasiswa = { "Rizki", "Rahmat", "Rahman", "Rahmi" };
        System.out.println();
        for (int i = 0; i < mahasiswa.length; i++){
            System.out.print(mahasiswa[i] + " ");
        }
    }
}
