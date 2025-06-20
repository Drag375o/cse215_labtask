package assignment2pt2;


public class Light extends  Electronics {
    public Light(String name, double hours) {
        super(name, hours);
    }

   
    public double expenditure() {
        return 1*this.getHours();
    }    
}
