package Macera_Oyunu;
import java.util.Scanner;

public class Game {
    private Scanner input =new Scanner(System.in);
    private Location location;
    public void start(){

        System.out.println("Oyuna Hoşgeldiniz!");
        System.out.println("Lütfen oyuncu ismi giriniz:");
        String playerName=input.nextLine();
        Player player=new Player(playerName);
        System.out.println("Sayın "+player.getName()+" Bu karanlık ve sisli adaya hoşgeldiniz. Burada yaşananların hepsi gerçek");
        player.selectChar();
        while(true){
            System.out.println("Gitmek istediginiz bolgeyi seciniz");
            System.out.println("Bölgeler");
            System.out.println("1-)Güvenli Ev" +
                    "\t\t2-)Mağaza");
            int selectLoc= input.nextInt();
            switch(selectLoc){
                case 1:
                    location=new SafeLocation(player);
                    break;
                case 2:
                    location=new ToolStore(player);
                    break;
                default:
                    location=new SafeLocation(player);
                    break;
            }
            location.onLocation();
            if(!location.onLocation()){
                System.out.println("Canınız tükendi \n Game Over!!!");
            }

        }
    }




}
