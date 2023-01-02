package Macera_Oyunu;

public abstract class NormalLocation extends Location{
    public NormalLocation(Player player, String LocationName) {
        super(player,LocationName);
    }

    @Override
    public boolean onLocation(){
        return true;
    }
}
