package BasicJava150;

import java.util.Scanner;

public class AreaOfCircal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the cicrle :");
        double radius = sc.nextDouble();
       

        //Area of the circle is pie * r^2 
        double area =((22/7)*Math.pow(radius, 2));
        System.out.println("Area of circle is :" + area);

       //Perimeter of the circle is 2*pie*r 
       double perimeter = (2*((22/7)*radius));
       System.out.println("Perimeter of the circlr is :"+ perimeter);
           }
    
}
