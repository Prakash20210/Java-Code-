import java.util.Scanner;

public class PalimdromNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int dup = n;
        int revsNo = 0;

        while(n>0){
            int lastDigit = n%10;
            n = n/10;
            revsNo = (revsNo*10)+lastDigit;
        }
        if(revsNo == dup){
            System.out.println("It is a Palindrom Number");
        }
        else {
            System.out.println("Not a Palindrom NUmaber");
        }


    }
    
}
