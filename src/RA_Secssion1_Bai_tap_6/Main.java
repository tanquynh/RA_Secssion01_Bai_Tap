package RA_Secssion1_Bai_tap_6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mes ;
        System.out.println("Nhap số cần kiểm tra: ");
        int number = scanner.nextInt();
        if( number % 3 == 0 && number % 5 == 0) {
          mes =  " chia hết cho cả 3 và 5";
        } else if( number % 5 == 0 && number % 3 != 0) {
            mes = " chia hết cho  5 và không chia hết cho 3";
        } else if( number % 3 == 0 && number % 5 != 0) {
            mes = " chia hết cho 3 và không chia hết cho 5";
        } else {
        mes =  " không chia hết cho 3 và 5";
        }
        System.out.println(number + mes);
    }
}
