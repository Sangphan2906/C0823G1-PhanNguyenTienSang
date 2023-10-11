package Loop_and_Array;

public class PrintPrimesUnder100 {
    public static void main(String[] args) {
        for (byte i = 2; i <= 100; i++) {
            byte countDivisor = 0;
            for (byte j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countDivisor++;
                }
            }
            if (countDivisor == 2) {
                System.out.println(i);
            }
        }
    }
}
