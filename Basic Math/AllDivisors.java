import java.util.Scanner;

public class AllDivisors {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int nums = sc.nextInt();

        for(int i = 1; i<=nums; i++){
            if(nums%i == 0)
              System.out.println(i);
        }
    }
    
}
