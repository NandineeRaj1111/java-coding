public class main {
    public static void main(String[] args) {
        User user1= new User("Nandinee","thegr8nr@gmail.com","12345");
        User user2= new User("Harsh","harshrajput@gmail.com","67894");
       
        System.out.println(user1.username);
        System.out.println(user1.id);
        System.out.println(user1.email);


        System.out.println(user2.username);
        System.out.println(user2.id);
        System.out.println(user2.email);

        Car car= new Car("Swift","maruti","red",2026,"T7");
        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.color);
        System.out.println(car.year);
        System.out.println(car.engine.type);


    }
}
