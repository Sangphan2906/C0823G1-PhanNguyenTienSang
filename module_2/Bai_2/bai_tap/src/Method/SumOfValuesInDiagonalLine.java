package Method;

import java.util.Scanner;

public class SumOfValuesInDiagonalLine {
    public static void main(String[] args) {
        byte widthAndHeight;
        short sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ rộng hoặc độ cao của mảng 2 chiều: ");
        widthAndHeight = scanner.nextByte();
        byte[][] array = new byte[widthAndHeight][widthAndHeight];
        for (byte i = 0; i < array.length; i++) {
            for (byte j = 0; j < array.length; j++) {
                System.out.print("Nhập giá trị phần tử ở hàng " + i + " cột " + j + ": ");
                array[i][j] = scanner.nextByte();
            }
        }
        for (byte i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("Tổng các giá trị ở đường chéo chính của ma trận vuông là: " + sum);
    }
}
