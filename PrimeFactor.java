import java.util.Scanner;
public class PrimeFactor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entet the value of n");
        int n=sc.nextInt();
        for(int div=2;div*div<=n;div++){
            while(n%div==0){
                n=n/div;
                System.out.print(div);
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}