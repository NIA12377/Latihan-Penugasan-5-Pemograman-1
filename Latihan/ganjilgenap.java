import java.util.Scanner;

public class ganjilgenap {
        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Angka  = ");
        double angka = in.nextDouble();


        if (angka %2==0 ) {
            System.out.println(angka + " adalah genap");
        } else {
            System.out.println(angka +" adalah ganjil");
        }

        in.close();

    }
    
}
