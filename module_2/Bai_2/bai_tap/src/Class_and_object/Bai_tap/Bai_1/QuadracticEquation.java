package Class_and_object.Bai_tap.Bai_1;

public class QuadracticEquation {
    private double a;
    private double b;
    private double c;
    public QuadracticEquation(double a, double b, double c){
        this.a= a;
        this.b= b;
        this.c= c;
    }
    public double getA(){
        return this.a;
    }
    public void setA(double a){
        this.a= a;
    }
    public double getB(){
        return this.b;
    }
    public void setB(double b){
        this.b= b;
    }
    public double getC(){
        return this.c;
    }
    public void setC(double c){
        this.c= c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2)- 4*this.a*this.c;
    }
    public double getRoot1(){
        if (this.getDiscriminant()>=0) {
            return (-this.b+Math.pow(Math.pow(this.b,2)-4*this.a*this.c,0.5))/2*this.a;
        } else {
            return 0;
        }
    }
    public double getRoot2(){
        if (this.getDiscriminant()>=0) {
            return (-this.b-Math.pow(Math.pow(this.b,2)-4*this.a*this.c,0.5))/2*this.a;
        }else {
            return 0;
        }
    }
}
