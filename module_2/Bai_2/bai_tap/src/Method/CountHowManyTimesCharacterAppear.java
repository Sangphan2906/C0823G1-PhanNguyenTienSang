package Method;

import java.util.Scanner;

public class CountHowManyTimesCharacterAppear {
    public static void main(String[] args) {
        String string;
        String[] array;
        String character;
        byte count = 0;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi:");
        string = scanner.nextLine();
        array = string.split("");
        System.out.print("Nhập ký tự cần tìm trong chuỗi: ");
        character = scanner.nextLine();
        for (byte i = 0; i < array.length; i++) {
            if (character.equals(array[i])) {
                count++;
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Ký tự " + character + " xuất hiện " + count + " lần trong chuỗi");
        } else {
            System.out.println("Ký tự " + character + " không có trong chuỗi!");
        }
    }
}
