package Macera_Oyunu;
import java.util.Scanner;

public class Player {
    Scanner input=new Scanner(System.in);
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private GameChar gamechar;
    private Location location;

    public Player(String name){

        this.name=name;

    }
    public void selectChar(){
       GameChar[] charlist={new Samurai(), new Archer(), new Knigth()};
        System.out.println("-------------------------------------");
        System.out.println("Karakterler:");
       for(GameChar gameChar:charlist){
           System.out.println("ID:"+gameChar.getId()+
                   "\t\tKarakter:"+gameChar.getName()+
                   "\t\tHasar"+gameChar.getDamage()+
                   "\t\tSağlık"+gameChar.getHealth()+
                   "\t\tMoney"+gameChar.getMoney() );
       }
        System.out.println("-------------------------------------");
        System.out.println("Lütfen id'ye göre bir karakter seçiniz:");
        int selectChar=input.nextInt();
        switch(selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knigth());
                break;
            default:
                break;
        }
        System.out.println("Karakter:"+this.getCharName()+
                "\tHasar:"+this.getDamage()+
                "\tSağlık:"+this.getHealth()+
                "\tMoney:"+this.getMoney());

    }
    public void  selectLoc(){

    }
    public void initPlayer(GameChar gamechar){
        this.setDamage(gamechar.getDamage());
        this.setHealth(gamechar.getHealth());
        this.setMoney(gamechar.getMoney());
        this.setCharName(gamechar.getName());
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getCharName() {
        return charName;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
