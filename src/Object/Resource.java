package Object;

/**
 * Created by siku on 3/25/17.
 */
public class Resource {
    private int diamiond_ = 0;
    private int oil_ = 0;

    Resource(int diamiond,int oil){
        this.diamiond_ = diamiond;
        this.oil_ = oil;
    }

    Resource(){
        this.diamiond_ = 1;
        this.oil_ = 2;
    }

    public int getDiamiond_(){
        return this.diamiond_;
    }
    protected void setDiamiond_(int diamiond){
        this.diamiond_ = diamiond;
    }
    public int getOil(){
        return this.oil_;
    }
    protected void setOil_(int oil){
        this.oil_ = oil;
    }

    @Override
    public String toString() {
        String str = new String("oil: " + this.oil_ + "; diamiod: "+this.diamiond_);
        return str;
    }
}
class TestResource{
    public static void main(String [] argvs){
        Resource r = new Resource(1,1);
        System.out.println(r);
        r.setOil_(5);
        System.out.println(r);
        r.setDiamiond_(34);
        System.out.println(r);
    }
}
