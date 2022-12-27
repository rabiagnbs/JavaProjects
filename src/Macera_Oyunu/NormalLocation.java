package Macera_Oyunu;

public abstract class NormalLocation extends Location{
    public NormalLocation(Player player) {
        super(player);
    }

    @Override
    public boolean onLocation(){
        return true;
    }
}
