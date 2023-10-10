import java.util.Scanner;

public class DeleteValueInArray {
    public static void main(String[] args) {
        byte lengthArray;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng:");
        lengthArray = scanner.nextByte();
        byte[] array = new byte[lengthArray];
        for (byte i = 0; i < array.length; i++) {
            System.out.println("Nhập giá trị phần tử ở vị trí " + i + "  của mảng:");
            array[i] = scanner.nextByte();
        }
        byte deletedValue;
        System.out.println("Nhập giá trị phần tử muốn xóa:");
        deletedValue = scanner.nextByte();
        boolean flag = true;
        //Delete value
        for (byte i = 0; i < array.length; i++) {
            if (deletedValue == array[i]) {
                array[i] = 0;
                byte temp;
                for (byte j = i; j < array.length; j++) {
                    if (j < array.length - 1) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
                flag = false;
            }
        }
        if (flag) System.out.println("Không có giá trị " + deletedValue + " trong mảng!");
        else {
            System.out.println("Mảng sau khi xóa giá trị " + deletedValue + " là:");
            for (byte i = 0; i < array.length; i++) {
                if (i == array.length - 1) System.out.print(array[i] + ".");
                else System.out.print(array[i] + ", ");
            }
        }
    }
}
