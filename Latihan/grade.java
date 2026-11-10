import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        String grade;
        Scanner in = new Scanner(System.in);

        System.out.print("Berapa nilai = ");
        double total = in.nextDouble();

 

        if (total  >= 85) {
          grade = "A"; 
          System.out.println("Status Lulus");
        }else if (total >= 70){
           grade = "B";
           System.out.println("Status Lulus");
        } else if (total >= 55){
           grade = "C";
           System.out.println("Status Tidak Lulus");
        }else if (total >= 40){
           grade = "D";
           System.out.println("Status Tidak Lulus");
        }  else {
           grade = "E";
           System.out.println("Status Tidak Lulus");
        }

        System.out.println("Hasil = " + grade);
         in.close();
   
    }
    
}
