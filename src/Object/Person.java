package Object;

/**
 * Created by siku on 3/25/17.
 */
public abstract class Person extends BaseObject implements Attack_interface {
    int value_attack_;
    int count_;

    Person(){}

    Person(int HP, int diamiond, int oil, int x, int y,int z, int value_attack, int count){
        super(HP,diamiond,oil,x,y,z);
        this.value_attack_ = value_attack;
        this.count_ = count;
    }

    @Override
    public void attack(BaseObject bo) {
        int surplus = bo.getHP_() - value_attack_;
        if (surplus > 0){
            bo.setHP_(surplus);
        } else {
            bo.setHP_(0);
        }
    }

    @Override
    public String toString() {
        String str = new String(super.toString()+"\nattack's value: "+this.value_attack_+"\n" +
                "The number of occupied population: "+this.count_);
        return str;
    }


}

//test

//class TestBaseObject{
//    public static void main(String []argv){
//        Person p = new Person(1,2,3,4,5,6,7);
//        System.out.println(p);
//    }
//}