package Object;

import BaseInterface.Move_interface;

/**
 * Created by siku on 3/25/17.
 */
public abstract class BaseObject implements Move_interface {
    abstract String getClassify(); //TODO: get the subclass's classify'name
    private int HP_;
    private Resource consume_;
    //3d coordinate
    private int x_;
    private int y_;
//    class Z{
//        //no use no create
//        int z_;
//    }
//    private Z z_;

    BaseObject(int HP,int diamiond,int oil,int x,int y) {
        this.HP_ = HP;
        consume_ = new Resource(diamiond,oil);
        move(x, y);
    }
    BaseObject(){
        this.HP_ = 1;
        this.x_ = 2;
        this.y_ = 3;
        this.consume_ = new Resource();
    }

    public void move(int x, int y){
        this.x_ = x;
        this.y_ = y;
    }
    public int getHP_() {
        return HP_;
    }

    public void setHP_(int HP) {
        this.HP_ = HP_;
    }

    @Override
    public String toString() {
        String str = new String("HP: "+this.HP_+"\n" + "" +
                "the Consume of resource: "+this.consume_+"\n" + "the coordinate: "+"("+this.x_+","+this.y_+")");
        return str;
    }
}



// test if want to work remove abstract


//class TestBaseObject{
//    public static void main(String []argv){
//        BaseObject bo = new BaseObject(1,2,3,4,5);
//        System.out.println(bo);
//        bo.move(4,7);
//        System.out.println(bo);
//    }
//}