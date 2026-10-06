import java.util.*;
public class javacode03 {
    public static void main(String arg[]){
        System.out.println("Enter Your First Number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Your second  Number :");
        int b = sc.nextInt();

        System.out.println(a+b);
        sc.close();
    }
}
