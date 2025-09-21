import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        HBD(name,age);  
        System.out.println("Enter a no"); 
        int num = sc.nextInt();
        square(num);
        System.out.println(cube(num));
    

    }
    static void HBD(String name,int age){
        System.out.println("HAPPY BIRTHDAY TO YOU");
        System.out.println("I wish you a very happy birthday dear "+ name);
        System.out.println("You are "+ age+" years old");
    }
    static void square(double n){
        double square= n*n;
        System.out.println("You will live " + square + " years");
    }
    static double cube(double n){
        return n*n*n;

    }

}

