package Object;

import java.util.ArrayList;

/**
 * Created by siku on 3/25/17.
 */
public class Player {
    public String name_;
    private int MaxNumberPeople_;
    private int NumberPeople_;
    private Resource resource_;
    private ArrayList<Person> people_;
    private ArrayList<BaseObject> building_;
    private ArrayList<Resource> resources_;

    @Override
    public String toString() {
        String str = new String("player's name: "+this.name_+"\nMAx number "+"of people:"+this
                .MaxNumberPeople_+"\nthe number of people: "+this.NumberPeople_+"\nthe people: " +
                ""+this.people_+"\nthe building: "+this.building_+"\nthe resources: "+this.resources_);
        return str;
    }
}

class TestPlayer{
    public static void main(String [] argvs){

    }
}