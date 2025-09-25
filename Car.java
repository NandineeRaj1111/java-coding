public class Car {
    String make="Ford";
    String model="Mustang";
    String color;
    int year=2025;
    boolean isRunning= false;
    Car(String model, String color){
        this.model=model;
        this.color=color;
    }
    void start(){
         isRunning=true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning=false;
        System.out.println("You stop the engine");
    }
    void drive(){
        System.out.println("You drive the "+" "+ this.color+" "+ this.model);
    }
}
