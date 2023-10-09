import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String [] args){
        short nam;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập năm:");
        nam = scanner.nextShort();
        if (nam%100==0){
            if (nam%400==0) System.out.println("Năm "+nam+" là năm nhuận");
            else System.out.println("Năm "+nam+" không phải là năm nhuận");
        }
        else if (nam%4==0) System.out.println("Năm "+nam+" là năm nhuận");
        else System.out.println("Năm "+nam+" không phải là năm nhuận");
    }
}
