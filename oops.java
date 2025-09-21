import java.util.Random;
import java.util.Scanner;

public class oops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();
        // importing from Car class and creating an obj named car
        Car car = new Car();
        // accessing different attributes of the obj 
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.make);
        System.out.println(car.isRunning);
    }
}
