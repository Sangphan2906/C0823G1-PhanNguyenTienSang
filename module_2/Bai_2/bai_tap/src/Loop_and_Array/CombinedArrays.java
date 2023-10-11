package Loop_and_Array;

import java.util.Scanner;

public class CombinedArrays {
    public static void main(String[] args) {
        byte length1;
        byte length2;
        byte j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng 1:");
        length1 = scanner.nextByte();
        System.out.println("Nhập độ dài mảng 2:");
        length2 = scanner.nextByte();
        byte[] array1 = new byte[length1];
        byte[] array2 = new byte[length2];
        for (byte i = 0; i < array1.length; i++) {
            System.out.println("Nhập phần tử ở vị trí thứ " + (i + 1) + ":");
            array1[i] = scanner.nextByte();
        }
        for (byte i = 0; i < array2.length; i++) {
            System.out.println("Nhập phần tử ở vị trí thứ " + (i + 1) + ":");
            array2[i] = scanner.nextByte();
        }
        int lengthSum = length1 + length2;
        byte[] arrayCombined = new byte[lengthSum];
        for (byte i = 0; i < array1.length; i++) {
            arrayCombined[i] = array1[i];
        }
        for (int i = array1.length; i < arrayCombined.length; i++) {
            arrayCombined[i] = array2[j];
            j++;
        }
        for (byte i = 0; i < arrayCombined.length; i++) {
            if (i == arrayCombined.length - 1) {
                System.out.print(arrayCombined[i] + ".");
            }
            else {
                System.out.print(arrayCombined[i] + ", ");
            }
        }
    }
}
