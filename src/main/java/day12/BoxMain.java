package day12;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box();
        double volume = box.volume();
        System.out.println("volume = " + volume);

        Box box1 = new Box(5.0, 5.5, 5.7);
        System.out.println("box1 = " + box1.volume());

        Box box2 = new Box(10.5);
        System.out.println("box2 = " + box2.volume());
    }
}
