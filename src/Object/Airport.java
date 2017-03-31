package Object;

import BaseInterface.UpDwonInterface;

/**
 * Created by siku on 3/28/2017.
 */
public class Airport  extends BaseObject implements UpDwonInterface {
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
        return "Airport";
    }

    // plyer use it and get a farmer
    // add it to player's  people
    boolean Create(Player player,Plane plane){
        if (player.getResource_().grearter(plane.getConsume_())){
            //player hold enough resource
            player.setResource_(player.getResource_().minus(plane.getConsume_()));
            return true;
        }else{
            return false;
        }
    }
}
