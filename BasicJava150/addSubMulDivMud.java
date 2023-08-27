package BasicJava150;

import java.util.Scanner;

public class addSubMulDivMud{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no :");
        int a = sc.nextInt();
        System.out.println("Enter second no :");
        int b = sc.nextInt();

        //1 Addition of two no
        int sum = a + b;
        System.out.println("Addition of two no is :" + sum);

        //2 Substration of tow no 
        int sub = a - b ;
        System.out.println("Substration of two no is :" + sub);

        //3 Multiply of two no 

        int mul = a * b ;
        System.out.println(" Multiply of two no is :" + mul);

        // 4 Divide of two no is 
        int div = a/b;
        System.out.println("divide of two no is " + div);

        //5 Remainder of two no is 
        double mod = a % b;
        System.out.println("Remainde of two no is :" + mod);

    }
}