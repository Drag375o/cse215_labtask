
package assignment2pt2;


public abstract class Electronics {
    private String name;
    private double hours;

    public Electronics(String name, double hours) {
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public double getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
        
    public abstract double expenditure();
}
