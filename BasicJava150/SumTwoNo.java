package BasicJava150;

import java.util.Scanner;

public class SumTwoNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        
        int sum = a + b ;
        System.out.println("Sum of Two Number is :" + sum);
    }
    
}
