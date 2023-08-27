package BasicJava150;

import java.util.Scanner;

public class SwapTwoNo {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
        int a = 5, b = 7;
          

        int temp = a;
            a = b;
            b = temp;
            System.out.println("Your swap no :"+ temp);
    }
    
}
