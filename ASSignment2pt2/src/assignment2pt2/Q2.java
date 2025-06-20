
package assignment2pt2;

import java.util.Scanner;


public class Q2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Give side 1 of 1st Rectangle  : ");
        double r1side1=s.nextDouble();
        System.out.print("Give side 2 of 1st Rectangle  : ");
        double r1side2=s.nextDouble();
        
        System.out.print("Give side 1 of 2nd Rectangle  : ");
        double r2side1=s.nextDouble();
        System.out.print("Give side 2 of 2nd Rectangle  : ");
        double r2side2=s.nextDouble();
        
        Rectangle r1=new Rectangle(r1side1,r1side2);
        Rectangle r2=new Rectangle(r2side1,r2side2);
        
        System.out.println("For Rectangle 1 : ");
        System.out.println(" The area is : "+r1.area()+" The perimeter is : "+r1.perimeter()+" and is the rectangle a square : "+r1.isSquare());
        
        System.out.println("For Rectangle 2 : ");
        System.out.println(" The area is : "+r2.area()+" The perimeter is : "+r2.perimeter()+" and is the rectangle a square : "+r2.isSquare());    
    
    }
    
    interface Quadrilateral{
        public double area(); 
        public double perimeter();
    }
    
    public static class Rectangle implements Quadrilateral{
        double side1;
        double side2;

        public Rectangle(double side1, double side2) {
            this.side1 = side1;
            this.side2 = side2;
        }

        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public void setSide1(double side1) {
            this.side1 = side1;
        }

        public void setSide2(double side2) {
            this.side2 = side2;
        }

        public double area() {
            return this.side1*this.side2;
        }

        public double perimeter() {
            return 2*(this.side1+this.side2);
        }
        
        public boolean isSquare(){
            if(this.side1==this.side2){
                return true;
            }
            else{
                return false;
            }
        }
    }    
}
