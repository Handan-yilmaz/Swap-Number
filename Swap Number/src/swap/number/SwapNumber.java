package swap.number;

import java.util.Scanner;

public class SwapNumber 
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int first_number;
        int second_number;
        
        System.out.print(" First Number : ");
        first_number = scanner.nextInt();
        
        System.out.print(" Second Number : ");
        second_number = scanner.nextInt();
        System.out.println(" Before being replaced... ");
        
        System.out.println("First Number : " + first_number + "Second Number : " + second_number );
        
        int temporary = first_number;
        first_number = second_number;
        second_number = temporary;
        
        System.out.println(" After being replaced..." );
        
         System.out.println("First Number : " + first_number + "Second Number : " + second_number );
        
    }
    
}
