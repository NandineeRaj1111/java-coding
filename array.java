import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size");
        int size= sc.nextInt();
        int[] a= new int[size];
        System.out.println("enter elements");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("the array elements are:");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}

