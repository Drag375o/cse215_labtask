
package assignment2pt2;

import java.util.Scanner;


public class Q6 {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello there");
        Scanner s=new Scanner(System.in);
        
        GeometricObject g2=new Rectangle(3,5);
        System.out.println(g2.toString());
        
        try{
        System.out.println("Give height");
        double height=s.nextDouble();
        System.out.println("Give width");
        double width=s.nextDouble();
        GeometricObject g1=new Rectangle(width,height);
        System.out.println(g1.toString());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
