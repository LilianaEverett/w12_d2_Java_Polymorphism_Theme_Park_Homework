package park;

import attractions.*;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.w3c.dom.Attr;
import people.Visitor;
import stalls.*;
import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private String name;
    private ArrayList<IReviewed> allReviewed;

    public ThemePark(String name) {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.name = name;
        this.allReviewed = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public int attractionsCount() {
        return this.attractions.size();
    }

    public int stallsCount() {
        return stalls.size();
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public void visit(Visitor visitor, Attraction attraction) {
        for (Attraction attr : attractions) {
            if (attr == attraction) {
                attraction.visitCount += 1;
                visitor.addVisitedAttraction(attraction);
            }
        }
    }

    public ArrayList<IReviewed> getAllReviewed() {
        for (IReviewed attraction : attractions) {
            allReviewed.add(attraction);
        }
        for (IReviewed stall : stalls) {
            allReviewed.add(stall);
        }
        return allReviewed;
    }
}
