package Thuat_toan;

public class ThuatToan1 {
    public static void main(String[] args) {
        for (byte j = 0; j < 5; j++) {
            for (byte k = 0; k < 11; k++) {
                if (k >= 5 - j  && k <= 5 + j ) {
                    System.out.print(" ");
                }
                if (k == 5 - j || k == 5 + j) {
                    if (k == 10) {
                        System.out.println(j + 1);
                    }
                    else {
                        System.out.print(j+1);
                    }
                    if (k < 5 - j - 1 || k > 5 + j + 1) {
                        if (k == 10) {
                            System.out.println(" ");
                        } else System.out.print(" ");
                    }
                }
            }
        }
            for ( byte j = 3; j >= 0; j--) {
                for (byte k = 0; k < 11; k++) {
                    if (k >= 5 - j && k <= 5 + j) System.out.print(" ");
                    if (k == 5 - j - 1 || k == 5 + j + 1) System.out.print(j + 1);
                    if (k < 5 - j - 1 || k > 5 + j + 1) {
                        if (k == 10) {
                            System.out.println(" ");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
