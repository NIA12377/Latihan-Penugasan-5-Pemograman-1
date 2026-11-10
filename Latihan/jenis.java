import java.util.Scanner;

public class jenis {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Masukkan Nilai");
        int tempat = in.nextInt();
        System.out.print("Masukkan Nilai");
        int tempat2 = in.nextInt();
        System.out.print("Masukkan Nilai");
        int tempat3 = in.nextInt();

        if (tempat != tempat2){
            if (tempat2 != tempat3){
                System.out.println("Segitiga 3 beda sisi");
            } else {
                System.out.println("Segitiga Sama Kaki");
            }
        }else{
            System.out.println("Segitiga Sama Sisi");
        }


        // String NamaHari;
        // switch (hari) {
        //     case 1: NamaHari = "Segitiga Tiga Sisi";
        //         break;
        //     case 2: NamaHari = "Segitiga sama Kaki";
        //         break;
        //     case 3: NamaHari = "Segitiga Sama Sisi";
        //         break;
        //     case 4: NamaHari = "Segitiga Sembarang";
        //         break;
       
        //     default:NamaHari = "Bukan Segitiga ";
        //         break;
        // }     
            // System.out.println(" bentuk " + NamaHari);
            in.close();
        

    }
    
}
