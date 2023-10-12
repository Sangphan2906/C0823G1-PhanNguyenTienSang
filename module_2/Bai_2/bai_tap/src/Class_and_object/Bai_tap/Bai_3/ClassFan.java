package Class_and_object.Bai_tap.Bai_3;

public class ClassFan {
    public int SLOW = 1;
    public int MEDIUM = 2;
    public int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public ClassFan() {

    }

    public ClassFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return this.SLOW;
    }

    public void setSLOW(int speed) {
        this.SLOW = speed;
    }

    public int getMEDIUM() {
        return this.MEDIUM;
    }

    public void setMEDIUM(int speed) {
        this.MEDIUM = speed;
    }

    public int getFAST() {
        return this.FAST;
    }

    public void setFAST(int speed) {
        this.FAST = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void IndefineObject() {
        ClassFan object = new ClassFan();
    }

    @Override
    public String toString() {
        if (!this.on) {
            System.out.println("Fan is off");
        } else {
            System.out.println("Fan is on");
        }
        return "ClassFan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
