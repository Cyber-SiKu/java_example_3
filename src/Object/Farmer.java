package Object;

/**
 * Created by siku on 3/27/17.
 */
public class Farmer extends Person {

    Farmer(){
        super();
    }

    Farmer(int HP, int diamond,int oil,int x,int y,int z,
           int value_attack, int count){
        super(HP,diamond,oil,x,y,z,value_attack,count);
    }

    @Override
    String getClassify() {
        return "Farmer";
    }

}
