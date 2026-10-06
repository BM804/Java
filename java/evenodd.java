import java.util.*;
public class evenodd {
    public static void main(String[] args) {
        System.out.println("enter the numer ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("the number is Even");
        }
        else {
            System.out.println("the number is odd");
        }
        sc.close();
    }
}
