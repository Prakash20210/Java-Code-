package BasicJava150;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of Rectangle :");
            double a = sc.nextDouble();
            System.out.println("Enter thr Width of Rectangle :");
            double b = sc.nextDouble();

            //1 Area of Rectangle 
            double area = (a * b);
            System.out.println("The area of Rectangle is :"+ area);
            
            //2 Perimeter of Rectangle
            double perimeter = 2 * (a + b);
            System.out.println("The Perimeter of  Rectangle is :"+ perimeter);
        }

    }
    
}
