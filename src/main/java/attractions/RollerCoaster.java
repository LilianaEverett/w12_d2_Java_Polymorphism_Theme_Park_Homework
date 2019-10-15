package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    @Override
    public double defaultPrice(Visitor visitor) {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() <= 200) {
            return this.price;
        } else {
            return this.price * 2;
        }
    }
}
