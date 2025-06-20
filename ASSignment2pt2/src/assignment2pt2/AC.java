
package assignment2pt2;


public class AC extends  Electronics {
    public AC(String name, double hours) {
            super( name, hours);
        }
        
        @Override
        public double expenditure() {
            return 5.5*this.getHours();
        }
}
