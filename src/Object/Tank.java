package Object;

/**
 * Created by siku on 3/28/2017.
 */
public class Tank extends Person {

    Tank(){
        super();
    }

    Tank(int HP, int diamond,int oil,int x,int y,int z,
           int value_attack, int count){
        super(HP,diamond,oil,x,y,z,value_attack,count);
    }

    @Override
    String getClassify() {
        return "Tank";
    }
}
