package Macera_Oyunu;
import java.util.Scanner;
public abstract class Location {
    private Player player;
    private String LocationName;
     public  Scanner input=new Scanner(System.in);

    public Location(Player player) {
        this.player = player;

    }

    public void Location(){

    }
    public abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }
}
