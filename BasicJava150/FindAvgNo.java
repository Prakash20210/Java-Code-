package BasicJava150;

import java.util.Scanner;

public class FindAvgNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        System.out.println("Enter the third number :");
        int c = sc.nextInt();

        int avg = (a + b + c)/3;
        System.out.println("Avrage of three number is :"+ avg);
    }
    
}
