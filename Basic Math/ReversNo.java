import java.util.Scanner;

public class ReversNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        
        int revsNo = 0;
        while(n>0){
            int lastDigit = n%10;
            n = n/10;
            revsNo = (revsNo*10) + lastDigit;
        }
        System.out.println(revsNo);



    }
    
}
