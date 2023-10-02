package RA_Secssion1_Bai_tap_5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điểm Toán");
        double toan = scanner.nextDouble();
        System.out.println("Nhập số điểm Lý");
        double ly = scanner.nextDouble();
        System.out.println("Nhập số điểm Tiếng Anh");
        double tienganh = scanner.nextDouble();
        System.out.println("Nhập số điểm Hóa");
        double hoa = scanner.nextDouble();
        System.out.println("Nhập số điểm Văn");
        double van = scanner.nextDouble();
        double dtb = ( toan + van + ly + hoa + tienganh ) / 5;
        if ( dtb < 5) {
            System.out.println("Xếp loại yếu");
        } else if ( dtb < 6.5) {
            System.out.println("Xếp loại trung bình");
        } else if ( dtb < 8) {
            System.out.println("Xếp loại khá");
        } else if ( dtb < 9) {
            System.out.println("Xếp loại Giỏi");
        }   else {
            System.out.println("Xếp loại Xuất sắc");
        }
    }
}
