package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed, ISecurity, IReviewed {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    @Override
    public double defaultPrice() {
        return this.price;
    }


    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() <= 200) {
            return this.price;
        } else {
            return this.price * 2;
        }
    }


    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145) {
            return true;
        } else return false;

    }
}
