import java.util.Scanner;
public class Gcd_Lcm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vlaue of n1 from n1 is divident");
        int n1=sc.nextInt();
        System.out.println("Enter the value of n2 from here n2 is divisor");
        int n2=sc.nextInt();
        int on1=n1;//original n1
        int on2=n2;//original n2
        while(n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n1=rem;
        }
        int gcd=n2;
        int lcm=(on1*on2)/gcd;
        System.out.println("Gcd is"+gcd);
         System.out.println("Lcm is"+lcm);

    }
}