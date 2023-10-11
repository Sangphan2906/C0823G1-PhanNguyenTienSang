package Loop_and_Array;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        // print rectangle
        byte lengthRectangle;
        byte widthRectangle;
        byte triangleHeight;
        byte isoscelesTriangleEdge;
        byte isoscelesTriangleHeight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình chữ nhật");
        lengthRectangle = scanner.nextByte();
        System.out.println("Nhập chiều rộng của hình chữ nhật:");
        widthRectangle = scanner.nextByte();
        for (byte i = 0; i < widthRectangle; i++) {
            for (byte j = 0; j < lengthRectangle; j++) {
                if (j == lengthRectangle - 1) {
                    System.out.println('*');
                }
                else {
                    System.out.print('*');
                }
            }
        }
        // print square triangle
        System.out.println("Nhập chiều cao của tam giác vuông:");
        triangleHeight = scanner.nextByte();
        for (byte i = 0; i < triangleHeight; i++) {
            for (byte j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.println("*");
                }
                else System.out.print("*");
            }
        }
        for (byte i = 0; i < triangleHeight; i++) {
            for (byte j = 0; j <= triangleHeight - 2 - i; j++) {
                System.out.print(" ");
            }
            for (byte k = 0; k <= i; k++) {
                if (k == i) {
                    System.out.println("*");
                }
                else {
                    System.out.print("*");
                }
            }
        }
        for (byte i = 0; i < triangleHeight; i++) {
            for (byte j = 0; j <= triangleHeight - 1 - i; j++) {
                if (j == triangleHeight - 1) {
                    System.out.println("*");
                }
                else {
                    System.out.print("*");
                }
            }
            for (byte k = 0; k <= i - 1; k++) {
                if (k == i - 1) {
                    System.out.println(" ");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
        for (byte i = 0; i < triangleHeight; i++) {
            for (byte j = 0; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (byte k = 0; k <= triangleHeight - 1 - i; k++) {
                if (k == triangleHeight - 1 - i) {
                    System.out.println("*");
                }
                else {
                    System.out.print("*");
                }
            }
        }
        System.out.println("Nhập độ dài cạnh đáy của tam giác cân:");
        isoscelesTriangleEdge = scanner.nextByte();
        System.out.println("Nhập chiều cao của tam giác cân:");
        isoscelesTriangleHeight = scanner.nextByte();
        for (byte i = 0; i < isoscelesTriangleHeight; i++) {
            for (byte j = 0; j < isoscelesTriangleEdge; j++) {
                if (j >= (isoscelesTriangleEdge - 1) / 2 - i && j <= (isoscelesTriangleEdge - 1) / 2 + i) {
                    System.out.print("*");
                }
                else {
                    if (j == isoscelesTriangleEdge - 1 && (isoscelesTriangleEdge - 1) != (isoscelesTriangleEdge - 1) / 2 + i)
                    {
                        System.out.println(" ");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
