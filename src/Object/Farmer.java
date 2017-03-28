package Object;

/**
 * Created by siku on 3/27/17.
 */
public class Farmer extends Person {
    int z_;     //z coordinate

    Farmer(){
        super();
        this.z_ = 0;
    }
    Farmer(int HP, int diamond,int oil,int x,int y,int z);
    @Override
    String getClassify() {
        return "Farmer";
    }
}
