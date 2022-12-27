package Macera_Oyunu;

public class GameChar {
    private String name;
    private int damage;
    private int money;
    private int health;
    private int id;

    public GameChar(String name,int damage, int money, int health,int id) {
        this.name=name;
        this.damage = damage;
        this.money = money;
        this.health = health;
        this.id=id;
    }

    public int getDamage() {
        return damage;
    }

    public int getMoney() {
        return money;
    }

    public int getHealth() {
        return health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
