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
    private ArrayList<Person> people;

    public Resource getResource_() {
        return this.resource_;
    }

    protected  void setResource_(Resource re){
        this.resource_ = re;
    }

    protected void setMaxNumberPeople_(int maxNumberPeople_) {
        MaxNumberPeople_ += maxNumberPeople_;
    }

    protected int getNumberPeople_() {
        return NumberPeople_;
    }
}

class TestPlayer{
    public static void main(String [] argvs){

    }
}