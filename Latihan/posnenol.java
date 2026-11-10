import java.util.Scanner;

public class posnenol {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan  angka: ");
        double angka = input.nextDouble();

        if (angka > 0) {
            System.out.println(angka + " adalah BILANGAN POSITIF");
        } else if (angka < 0) {
            System.out.println(angka + " adalah BILANGAN NEGATIF");
        } else {
            System.out.println("Angka tersebut adalah NOL");
        }

        input.close();
    }
}
