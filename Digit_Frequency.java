import java.util.Scanner;
public class Digit_Frequency{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value of n");
        int n=sc.nextInt();
              System.out.println("Enter the value of d");
        int d=sc.nextInt();
        int f=frquency(n,d);
        System.out.println(f);
       
    }
    public static int frquency(int n,int d){
        int rev=0;
        while(n>0){
            int dig=n%10;
            n=n/10;
            if(dig==d){
                rev++;
            }
        }
        return rev;
    }
}