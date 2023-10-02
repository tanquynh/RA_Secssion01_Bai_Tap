package RA_Secssion1_Bai_tap_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--------------MENU--------------");
            System.out.println("1. Chuyển đổi USD sang VND");
            System.out.println("2. Chuyển đổi VND sang USD");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số USD: ");
                    double usd = scanner.nextDouble();
                    if (usd >= 0) {
                        double changeUSDtoVND = usd * 23000;
                        System.out.println(usd + " USD tương đương " + changeUSDtoVND + " VND");
                    } else {
                        System.out.println("Số USD phải lớn hơn hoặc bằng 0.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập số VND: ");
                    double vnd = scanner.nextDouble();
                    if (vnd >= 0) {
                        double changeVNDtoUSD = vnd / 23000;
                        System.out.println(vnd + " VND tương đương " + changeVNDtoUSD + " USD");
                    } else {
                        System.out.println("Số VND phải lớn hơn hoặc bằng 0.");
                    }
                    break;
                case 3:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 3);
    }
}
