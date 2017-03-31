package Object;

/**
 * Created by siku on 3/28/2017.
 */
public class SupplyStation extends BaseObject {
    @Override
    String getClassify() {
        return "supply station";
    }

    SupplyStation(Player player){
        super();
        player.setMaxNumberPeople_(player.getNumberPeople_()+8);
    }
}
