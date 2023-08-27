package BasicJava150;

import java.util.Scanner;

public class ProductOfTwoNo {
    
    public static void main(String[] args) {
       int a , b , product;
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter first no :");
          a = sc.nextInt();
          System.out.println("Enter second no :");
           b = sc.nextInt();
           
           product = (a * b);

           System.out.println("Product of two no is :" + product);
          
    }
}
