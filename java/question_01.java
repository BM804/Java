import java.util.*;
public class question_01 {
    public static void main(String[] args) {
        System.out.print("Enter your Number ::");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum  = 0;
        for(int i=1;i<=a;i++){
            sum = sum +i;

        }
        System.out.print("The sum is ::");
        System.out.println(sum);
        sc.close();
    }
}
