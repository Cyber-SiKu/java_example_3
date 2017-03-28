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
}
