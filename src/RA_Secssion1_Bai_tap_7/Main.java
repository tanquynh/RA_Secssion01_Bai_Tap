package RA_Secssion1_Bai_tap_7;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập số cần chuyển đổi");
    int number = scanner.nextInt();
    String mes;
    switch (number) {
        case 1:
          mes = " một";
            break;
        case 2:
            mes = " hai";
            break;
        case 3:
            mes = " ba";
            break;
        case 4:
            mes = " bốn";
            break;
        case 5:
            mes = " năm";
            break;
        case 6:
            mes = " sáu";
            break;
        case 7:
            mes = " bảy";
            break;
        case 8:
            mes = " tám";
            break;
        case 9:
            mes = " chín";
            break;
       default:
            mes = "Số nhập vào phải nằm trong khoảng từ 0 đến 9";
            break;

    }
    System.out.println(mes);
}


}
