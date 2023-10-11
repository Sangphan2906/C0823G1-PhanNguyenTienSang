package Method;

import java.util.Scanner;

public class SumOfValuesInColumn {
    public static void main(String[] args) {
        byte row;
        byte column;
        byte columnFindSum;
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng 2 chiều: ");
        row = scanner.nextByte();
        System.out.print("Nhập số cột của mảng 2 chiều:");
        column = scanner.nextByte();
        double[][] array = new double[row][column];
        for (byte i = 0; i < array.length; i++) {
            for (byte j = 0; j < array[i].length; j++) {
                System.out.print("Nhập giá trị phần tử ở hàng " + i + " cột " + j + ": ");
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Nhập vị trí cột cần tính tổng các phần tử: ");
        columnFindSum = scanner.nextByte();
        for (byte i = 0; i < array.length; i++) {
            sum += array[i][columnFindSum];
        }
        System.out.println("Tổng các phần tử ở cột " + columnFindSum + " trong mảng là: " + sum);
    }
}
