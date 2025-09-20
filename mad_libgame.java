import java.util.Scanner;
public class mad_libgame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String adj1;
        String adj2;
        String noun;
        String verb1;
        String verb2;
        System.out.println("Enter adj");
        adj1=sc.next();
        System.out.println("enter noun");
        noun=sc.next();
        System.out.println("enter adj2 and verb");
        adj2=sc.next();
        verb1=sc.next();
        System.out.println("enter verb with ing");
        verb2=sc.next();
        System.out.println("Today I want to a "+ adj1+" zoo");
        System.out.println("I saw a "+ noun);
        System.out.println(noun +"was "+adj1+" and he "+verb1 );
        System.out.println("I was "+verb2 );
    }
}
