import java.util.Scanner;
public class InverseNumber{

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rev=0;
    int op=1;
    while(n!=0){
        int od=n%10;
        int id=op;
        int ip=od;
        rev=rev+id*(int)Math.pow(10,ip-1);
        n=n/10;
        op++;
    }
    System.out.println(rev);
    }
}