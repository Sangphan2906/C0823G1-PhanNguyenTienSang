package Class_and_object.Bai_tap.Bai_1;

import java.util.Scanner;

public class PrintQuadraticEquationAndRoots {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Phương trình bậc 2 có dạng: ax2+bx=c");
        System.out.print("Nhập hệ số a: ");
        a= scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        b= scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        c= scanner.nextDouble();
        QuadracticEquation quadracticEquation= new QuadracticEquation(a,b,c);
        System.out.print("Phương trình của bạn là: "+quadracticEquation.getA()+"x2+"+quadracticEquation.getB()+"x="+quadracticEquation.getC());
        if (quadracticEquation.getDiscriminant()>0){
            System.out.println("Phương trình có hai nghiệm là: "+quadracticEquation.getRoot1()+" và "+quadracticEquation.getRoot2());
        } else if (quadracticEquation.getDiscriminant()==0){
            System.out.println("Phương trình có nghiệm kép là: "+quadracticEquation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
