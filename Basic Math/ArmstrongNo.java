import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int dup = n;
       int sum = 0;
       int rv = 0;

       while(n>0){
        int ld = n%10;
        sum = sum +( ld * ld * ld );
        n = n/10;
         rv = (rv * 10)+ld;

       }
       if(rv == dup){
        System.out.println("It is a Armstrong Number");
       }
      else  {
        System.out.println("Not a Armstron Number");
       }

    }
}
