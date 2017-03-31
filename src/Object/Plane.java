package Object;

/**
 * Created by siku on 3/28/2017.
 */
public class Plane  extends Person  {

    Plane(){
        super();
    }

    Plane(int HP, int diamond,int oil,int x,int y,int z,
           int value_attack, int count){
        super(HP,diamond,oil,x,y,z,value_attack,count);
    }

    @Override
    String getClassify() {
        return "Plane";
    }
}
