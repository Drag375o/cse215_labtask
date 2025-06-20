
package assignment2pt2;

import java.util.Scanner;


public class Q5 {

    public static void main(String[] args) {
        System.out.println("here I am");
        Scanner s=new Scanner(System.in);
        System.out.println("give hours of usage for light :");
        double lih=s.nextDouble();
        System.out.println("give hours of usage for AC :");
        double Ach=s.nextDouble();
        
        Light L=new Light("Light",lih);
        AC a=new AC("AC",Ach);
        
        double total=a.expenditure()+L.expenditure();
        System.out.println("Total usage : "+total);
        
    }
    
    
}
