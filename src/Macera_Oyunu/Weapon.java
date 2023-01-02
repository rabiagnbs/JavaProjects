package Macera_Oyunu;

public class Weapon {
    private String name;
    private int  id;
    private int damage;
    private int price;

    public Weapon(String name, int id, int damage, int price) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }
    public static Weapon[] weapons(){
        Weapon[] weaponlist=new Weapon[3];

        weaponlist[0]=new Weapon("Tabanca: ",1,7,5);
        weaponlist[1]=new Weapon("Kılıç: ",2,3,7);
        weaponlist[2]=new Weapon("Tüfek: ",3,7,9);

        return weaponlist;
    }
    public static Weapon getweaponobjById(int id){
        for(Weapon w: Weapon.weapons()){
            if(w.getId()==id){
                return w;
            }
        }
        return null;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
