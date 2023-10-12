package Class_and_object.Bai_tap.Bai_3;

public class OperateWithClass {
    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan(3, true, 10, "yellow");
        ClassFan fan2 = new ClassFan(2, false, 5, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
