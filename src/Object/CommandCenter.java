package Object;

import BaseInterface.UpDwonInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by siku on 3/28/17.
 */
public class CommandCenter extends BaseObject implements UpDwonInterface {
    @Override
    public void uprising(int z) {
        this.setZ_(z);
    }

    @Override
    public void downLanding() {
        this.setZ_(0);
    }

    @Override
    String getClassify() {
        return "commander center";
    }

    // plyer use it and get a farmer
    // add it to player's  people
    boolean CreateFarmer(Player player,Farmer farmer){
        if (player.getResource_().grearter(farmer.getConsume_())){
            //player hold enough resource
            player.setResource_(player.getResource_().minus(farmer.getConsume_()));
            return true;
        }else{
            return false;
        }
    }
}
