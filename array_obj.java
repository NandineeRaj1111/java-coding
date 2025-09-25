public class array_obj {
    public static void main(String[] args) {
        // Car car1= new Car("MUSTANG", "red");
        // Car car2= new Car("Lamborghini", "black");
        // Car car3 = new Car("Nano", "yellow");
    

        Car[] cars={new Car("Mustang","red"),
                   new Car("Lamborgini","black"),
                   new Car("Nano","yellow")

        };
        for(Car car: cars){
            car.drive();
        }
    } 
    
}
