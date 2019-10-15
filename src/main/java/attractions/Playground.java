package attractions;

import behaviours.IReviewed;
import people.Visitor;

public class Playground extends Attraction implements IReviewed {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 12){
            return true;
        } else return false;
    }
}
