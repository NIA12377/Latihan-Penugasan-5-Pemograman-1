import java.util.Scanner;

public class kalkulator {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("Masukkan angka pertama: ");
        double a = in.nextDouble();

        
        System.out.print("Masukkan operator (+ - * /): ");
        char op = in.next().charAt(0);

        
        System.out.print("Masukkan angka ke dua: ");
        double b = in.nextDouble();

        
        switch (op) {
            case '+':
                System.out.println("Hasil = " + (a + b));
                break;

            case '-':
                System.out.println("Hasil = " + (a - b));
                break;

            case '*':
                System.out.println("Hasil = " + (a * b));
                break;

            case '/':
                
                if (b == 0) {
                    System.out.println("Tidak bisa dibagi nol");
                } else {
                    System.out.println("Hasil = " + (a / b));
                }
                break;

            default:
                System.out.println("Operator tidak dikenal");
                break;
        }

        in.close();
    }
    
}
