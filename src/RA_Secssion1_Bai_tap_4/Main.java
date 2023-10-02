package RA_Secssion1_Bai_tap_4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chose;
        do {
            System.out.println("---------MENU---------");
            System.out.println("1. Tính chu vi, diện tích hình vuông");
            System.out.println("2. Tính chu vi, diện tích hình chữ nhật");
            System.out.println("3. Thoát");
            System.out.println("Nhập lựa chọn của bạn ");
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("Nhập kich thước cạnh hình vuông");
                    double canh = scanner.nextDouble();
                    double area = canh * canh;
                    double perimeter  = 4 * canh;
                    System.out.println(" Chu vi hình vuông là : " + perimeter);
                    System.out.println(" Diện tích hình vuông là : " + area);

                    break;
                case 2:
                    System.out.println("Nhập cạnh dài hình chữ nhật");
                    double canhdai = scanner.nextDouble();
                    System.out.println("Nhập cạnh ngắn hình chữ nhật");
                    double canhngan = scanner.nextDouble();
                    double dientichHcn = canhdai * canhngan;
                    double CvHcn = 2 * (canhdai + canhngan);
                    System.out.println("Chu vi hình chữ nhật là : " + CvHcn);
                    System.out.println("Diện tích hình chữ nhật là : " + dientichHcn);

                    break;
                case 3:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Chọn sai");
                    break;
            }
        } while (chose !=2);
    }
}
