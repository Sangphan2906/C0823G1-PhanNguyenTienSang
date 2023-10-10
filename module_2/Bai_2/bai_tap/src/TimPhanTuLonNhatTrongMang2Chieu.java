import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        byte lengthArray;
        byte lengthValue;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng 2 chiều:");
        lengthArray = scanner.nextByte();
        System.out.println("Nhập độ dài của phần tử mảng 1 chiều:");
        lengthValue = scanner.nextByte();
        byte[][] array2D = new byte[lengthArray][lengthValue];
        for (byte i = 0; i < array2D.length; i++) {
            for (byte j = 0; j < array2D[i].length; j++) {
                System.out.println("Nhập giá trị phần tử ở hàng " + i + " cột " + j + ":");
                array2D[i][j] = scanner.nextByte();
            }
        }
        byte max = array2D[0][0];
        for (byte i = 0; i < array2D.length; i++) {
            for (byte j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] > max) max = array2D[i][j];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng 2 chiều ban đầu là: " + max);
    }
}
