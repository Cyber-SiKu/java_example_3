package Object;

import BaseInterface.UpDwonInterface;

/**
 * Created by siku on 3/28/17.
 */
public class Barracks extends BaseObject implements UpDwonInterface {
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
        return "Barracks";
    }

    boolean CreateMarines(Player player,Marines marines){
        if (player.getResource_().grearter(marines.getConsume_())){
            //player hold enough resource
            player.setResource_(player.getResource_().minus(marines.getConsume_()));
            return true;
        }else{
            return false;
        }
    }
}
