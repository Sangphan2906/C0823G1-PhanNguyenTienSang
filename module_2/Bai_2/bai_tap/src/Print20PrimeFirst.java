public class Print20PrimeFirst {
    public static void main(String[] args) {
        byte countPrime = 0;
        for (short i = 2; true; i++) {
            short countDivisor = 0;
            for (short j = 1; j <= i; j++) {
                if (i % j == 0) countDivisor++;
            }
            if (countDivisor == 2) {
                System.out.println(i);
                countPrime++;
            }
            if (countPrime == 20) break;
        }
    }
}
