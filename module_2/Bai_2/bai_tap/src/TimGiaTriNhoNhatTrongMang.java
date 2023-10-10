import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        byte length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng:");
        length = scanner.nextByte();
        byte[] array = new byte[length];
        for (byte i = 0; i < array.length; i++) {
            System.out.println("Nhập giá trị phần tử thứ " + (i + 1) + " của mảng:");
            array[i] = scanner.nextByte();
        }
        byte min = array[0];
        for (byte i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
