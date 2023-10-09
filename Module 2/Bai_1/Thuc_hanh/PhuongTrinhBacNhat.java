import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String [] args){
        float a;
        float b;
        float c;
        float x;
        Scanner nhap= new Scanner(System.in);
        System.out.println("Phương trình bậc nhất ax+b=c");
        System.out.println("Nhập hệ số a:");
        a= nhap.nextFloat();
        System.out.println("Nhập số b:");
        b= nhap.nextFloat();
        System.out.println("Nhập số c:");
        c= nhap.nextFloat();
        System.out.println();
        if (a==0) System.out.println("Phương trình không xác định");
        else {
            x=(c-b)/a;
            System.out.println("x= "+x);
        }
    }
}
