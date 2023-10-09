import java.util.Scanner;

public class LaySoNgayTrongThang {
    public static void main(String [] args){
        byte thang;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập tháng:");
        thang= scanner.nextByte();
        switch (thang){
            case 2: System.out.println("Tháng 2 có 28 hoặc 29 ngày");
            break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("Tháng "+thang+" có 31 ngày");
            break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("Tháng "+thang+" có 30 ngày");
            break;
        }
    }
}
