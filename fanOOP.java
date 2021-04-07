public class fanOOP {
    int speed;
    boolean status;
    int radius;
    String color;

    public fanOOP() {
    }

    public fanOOP(int speed, boolean status, int radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
       this.status = status;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "fanOOP{" +
                "speed=" + speed +
                ", status=" + status +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        fanOOP fan1 = new fanOOP(3,true,10,"yellow");
        System.out.println(fan1.toString());
        fan1.setSpeed(1);
        fan1.setStatus(true);
        fanOOP fan2 = new fanOOP(2,false,5,"blue");
        System.out.println(fan2.toString());



    }
}