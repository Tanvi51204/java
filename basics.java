//subtract the product and sum of digits in an integar
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int sum=0;
        int prod=1;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            prod=prod*rem;
            n=n/10;
        }
        System.out.println("sum="+sum);
        System.out.println("product="+prod);
        System.out.println("subtraction="+(prod-sum));
    }
}
