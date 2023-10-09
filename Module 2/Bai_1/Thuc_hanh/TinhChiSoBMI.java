import java.util.Scanner;

public class TinhChiSoBMI {
    public static void main(String [] args){
        float bmi;
        float weight;
        float height;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập cân nặng:");
        weight= scanner.nextFloat();
        System.out.println("Nhập chiều cao:");
        height= scanner.nextFloat();
        bmi= weight/(height*height);
        if (bmi<18.5) System.out.println("Underweight");
        else if (bmi<25) System.out.println("Normal");
        else if (bmi<30) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}
