import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        byte length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng:");
        length = scanner.nextByte();
        byte[] array = new byte[length];
        for (byte i = 0; i < array.length; i++) {
            System.out.println("Nhập giá trị phần tử thứ " + (i + 1) + " của màng:");
            array[i] = scanner.nextByte();
        }
        byte insertedValue;
        byte insertedIndex;
        System.out.println("Nhập giá trị của phần tử cần chèn vào mảng:");
        insertedValue = scanner.nextByte();
        System.out.println("Nhập vị trí cần chèn phần tử vào mảng:");
        insertedIndex = scanner.nextByte();
        byte[] insertedArray = new byte[length + 1];
        byte j = 0;
        for (byte i = 0; i < insertedArray.length; i++) {
            if (i == insertedIndex) insertedArray[i] = insertedValue;
            else {
                insertedArray[i] = array[j];
                j++;
            }
        }
        for (byte i = 0; i < insertedArray.length; i++) {
            if (i == insertedArray.length - 1) System.out.print(insertedArray[i] + ".");
            else System.out.print(insertedArray[i] + ", ");
        }
    }
}
