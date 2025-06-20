
package assignment2pt2;


public class Q4 {
    public static void main(String[] args){
        //a
        try{
        int[] arr = new int[5];
        System.out.println(arr[5]); 
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" The exception will be for : "+e.getMessage()+" ,the Exception is ArrayIndexOutOfBoundsException ");
        }
        //b
        try{
            System.out.println(9 / 0);
        }
        catch(ArithmeticException e){
            System.out.println(" The exception will be for : "+e.getMessage()+" ,the Exception is ArithmeticException ");
        }
        //c
        try{
            String str = "NSU";
            System.out.println(str.charAt(3));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(" The exception will be for : "+e.getMessage()+" ,the Exception is StringIndexOutOfBoundsException ");
        }
        //d
        try{
            System.out.print(" The value is "+3.0/0);
            System.out.println(". There is no exception in (d) as for floating number divided by zero ,answer is infinity.");
        }
        catch(Exception e){
            System.out.println(" The exception will be for : "+e.getMessage());
        }
        
        //e
        try{
            Object obj = new Object();
            String s = (String)obj;
        }
        catch(ClassCastException e){
            System.out.println(" The Exception is ClassCastException where "+e.getMessage());
        }    
    
    
    
    }
}
