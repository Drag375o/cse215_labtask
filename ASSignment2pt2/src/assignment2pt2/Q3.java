
package assignment2pt2;

import java.util.Scanner;


public class Q3 {
    public static void main(String[] args){
    
        System.out.println("Works");
        Scanner s=new Scanner(System.in);
        System.out.print("Give 1st side of Rectangle : ");
        double r1side1=s.nextDouble();
        System.out.print("Give 2nd side of Rectangle  : ");
        double r1side2=s.nextDouble();
        
        Rectangle r1=new Rectangle(r1side1,r1side2);
        System.out.println(" The area is : "+r1.area()+" The perimeter is : "+r1.perimeter());
        
        System.out.print("Give 1st Diagonal  of Rhombus  : ");
        double r2d1=s.nextDouble();
        System.out.print("Give side of Rhombus  : ");
        double r2d2=s.nextDouble();
        
        Rhombus r2=new Rhombus(r2d1,r2d2);
        System.out.println(" The area is : "+r2.area()+" The perimeter is : "+r2.perimeter());
        System.out.println("Are the areas equal :"+r2.isEqualArea(r1));
                
        
    }
    
    interface Quadrilateral{
        public double area(); 
        public double perimeter();
    }
    
    public static class Rhombus implements Quadrilateral{
        private double diag1;
        private double side;

        public Rhombus(double diag1, double side) {
            this.diag1 = diag1;
            this.side = side;
        }

        public double getDiag1() {
            return this.diag1;
        }

        public double getSide() {
            return this.side;
        }

        public void setDiag1(double diag1) {
            this.diag1 = diag1;
        }

        public void setSide(double side) {
            this.side = side;
        }
        
        
        @Override
        public double area() {
            double diag2=Math.sqrt((4*this.side*this.side)-(this.diag1*this.diag1));
            return (this.diag1*diag2)/2;
        }

        @Override
        public double perimeter() {
            return 4*this.getSide();
        }
        
        public boolean isEqualArea(Rectangle r){
            if(r.area()==this.area()){
                return true;
            }
            else{
                return false;
            }
        }
    
    }
    
    
    public static class Rectangle implements Quadrilateral{
        private double side1;
        private double side2;

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
