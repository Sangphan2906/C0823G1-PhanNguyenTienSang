package Introduction_to_Java;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String [] args){
        double vnd;
        float usd;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số tiền USD:");
        usd = scanner.nextFloat();
        if (usd>=0) {
            vnd= usd*24.099;
            System.out.println("Số tiền VND được chuyển đổi qua là: "+vnd);
        }
        else System.out.println("Số tiền nhập vào không hợp lệ");
    }
}
