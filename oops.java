import java.util.Random;
import java.util.Scanner;

public class oops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();
        // importing from Car class and creating an obj named car
        Car car = new Car();
        Car car1= new Car();  //both the obj have same attributes since both belong to the same class
        // accessing different attributes of the obj 
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.make);
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        System.out.println(car1.model);
        
    }
}
