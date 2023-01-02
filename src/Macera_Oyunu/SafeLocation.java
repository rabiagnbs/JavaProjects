package Macera_Oyunu;

public class SafeLocation extends NormalLocation{
    public SafeLocation(Player player) {
        super(player,"Güvenli evdesiniz");
    }

    @Override
   public  boolean onLocation(){
        System.out.println("Güvenli Evdesiniz!!");
        System.out.println("Canınız yenilendi.");
        return true;
    }
}
