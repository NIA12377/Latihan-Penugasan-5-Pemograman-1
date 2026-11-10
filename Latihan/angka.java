import java.util.Scanner;

public class angka {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("========== Menu Hari =========");
        System.out.println("1. Hari Senin");
        System.out.println("2. Hari Selasa");
        System.out.println("3. Hari Rabu");
        System.out.println("4. Hari Kamis");
        System.out.println("5. Hari Jumat");
        System.out.println("========Pilih Hari apa========");
        System.out.print("=");
        int hari = in.nextInt();

        String NamaHari;
        switch (hari) {
            case 1: NamaHari = "Senin";
                break;
            case 2: NamaHari = "Selasa";
                break;
            case 3: NamaHari = "Rabu";
                break;
            case 4: NamaHari = "Kamis";
                break;
            case 5: NamaHari = "Jumat";
                break;
       
            default:NamaHari = "Tidak ada hari ";
                break;
        }     
            System.out.println(" hari " + NamaHari);
            in.close();
        

    }
    
}
