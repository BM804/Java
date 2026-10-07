import java.util.*;
public class ifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int a = sc.nextInt();
        if (a ==1){
            System.out.println("Namaste");
        }
        else if (a ==2){
            System.out.println("Hello");
        }
        else if (a==3){
            System.out.println("bonjur");

        }
        else {
            System.out.println("Invalid input");
        }
    }

}
