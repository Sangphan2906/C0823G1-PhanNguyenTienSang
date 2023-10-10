import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        // print rectangle
        byte lengthRectangle;
        byte widthRectangle;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình chữ nhật");
        lengthRectangle = scanner.nextByte();
        System.out.println("Nhập chiều rộng của hình chữ nhật:");
        widthRectangle = scanner.nextByte();
        for (byte i = 0; i < widthRectangle; i++) {
            for (byte j = 0; j < lengthRectangle; j++) {
                if (j == lengthRectangle - 1) System.out.println('*');
                else System.out.print('*');
            }
        }
        // print square triangle
        byte triangleHeight;
        System.out.println("Nhập chiều cao của tam giác vuông:");
        triangleHeight = scanner.nextByte();
        for (byte i = 0; i < triangleHeight; i++) {
            for (byte j = 0; j <= i; j++) {
                if (j == i) System.out.println("*");
                else System.out.print("*");
            }
        }
        for (byte i = 0; i < triangleHeight; i++) {
            for (byte j = 0; j <= triangleHeight - 2 - i; j++) {
                System.out.print(" ");
            }
            for (byte k = 0; k <= i; k++) {
                if (k == i) System.out.println("*");
                else System.out.print("*");
            }
        }
        for (byte i = 0; i < triangleHeight; i++) {
            for (byte j = 0; j <= triangleHeight - 1 - i; j++) {
                if (j == triangleHeight - 1) System.out.println("*");
                else System.out.print("*");
            }
            for (byte k = 0; k <= i - 1; k++) {
                if (k == i - 1) System.out.println(" ");
                else System.out.print(" ");
            }
        }
        for (byte i = 0; i < triangleHeight; i++) {
            for (byte j = 0; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (byte k = 0; k <= triangleHeight - 1 - i; k++) {
                if (k == triangleHeight - 1 - i) System.out.println("*");
                else System.out.print("*");
            }
        }
        byte triangleEdge1;
        byte triangleHeight1;
        System.out.println("Nhập độ dài cạnh đáy của tam giác cân:");
        triangleEdge1 = scanner.nextByte();
        System.out.println("Nhập chiều cao của tam giác cân:");
        triangleHeight1 = scanner.nextByte();
        for (byte i = 0; i < triangleHeight1; i++) {
            for (byte j = 0; j < triangleEdge1; j++) {
                if (j >= (triangleEdge1 - 1) / 2 - i && j <= (triangleEdge1 - 1) / 2 + i) System.out.print("*");
                else {
                    if (j == triangleEdge1 - 1 && (triangleEdge1 - 1) != (triangleEdge1 - 1) / 2 + i)
                        System.out.println(" ");
                    else System.out.print(" ");
                }
            }
        }
    }
}
