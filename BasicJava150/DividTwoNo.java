package BasicJava150;

import java.util.Scanner;

public class DividTwoNo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no :");
        int a = sc.nextInt();
        System.out.println("Enter second no :");
        int b = sc.nextInt();
         int div = a/b;

         System.out.println("Divid of two no is :" + div);
    }
    
}
