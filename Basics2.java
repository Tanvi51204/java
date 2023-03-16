//Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        while(true){
        int n=in.nextInt();
        if(n>0){
                sum=sum+n;
            }
            else{
                break;
            }

        }
        System.out.println(sum);
    }

}
