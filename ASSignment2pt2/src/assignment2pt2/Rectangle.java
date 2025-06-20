
package assignment2pt2;


public class Rectangle extends  GeometricObject implements ExceptionInterface{
    private double width;
    private double height;

    public Rectangle() {
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(double width, double height) throws Exception {
        this.setHeight(height);
        this.setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    @Override
    public double getArea() {
        return this.height*this.width;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.height+this.width);
    }

    @Override
    public void setWidth(double newWidth) throws Exception {
        if(newWidth<0){
            throw new Exception("Height /Width can not be negative.");
        }
    }

    @Override
    public void setHeight(double newHeight) throws Exception {
        if(newHeight<0){
            throw new Exception("Height /Width can not be negative.");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
    
    
    
}
