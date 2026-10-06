import java.util.*;
public class conditional_adult {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age::");
        int age = sc.nextInt();
        if (age >=18){
            System.out.println("your are adult");
        }
        else{
            System.out.println("You are not adult");
        }
        sc.close();
    }
}
