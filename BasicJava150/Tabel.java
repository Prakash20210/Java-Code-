package BasicJava150;

import java.util.Scanner;

public class Tabel {
    private static final String Systam = null;

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Table of no :");
    int x = sc.nextInt();

    for(int i = 0; i<10; i++){
        
        System.out.println(x + "x" + (i+1)+ "=" + (x * (i + 1)));
    }
    
    }
    
}
