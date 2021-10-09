import java.util.Scanner;
public class Pythagorean{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the value of a");
        int a=sc.nextInt();
         System.out.println("Ente the value of b");
        int b=sc.nextInt();
         System.out.println("Ente the value of c");
        int c=sc.nextInt();
        int max=a;
        if(b>=max){
            max=b;
        }
        if(c>=max){
            max=c;
        }
        if(max==a){
            System.out.println((b*b+c*c)==(a*a));
        }
        else if(max==b){
            System.out.println((a*a+c*c)==(b*b));
        }
        else{
             System.out.println((a*a+b*b)==(c*c));
        }
    }
}