package boksMaçı;

public class fighter {
    String name;
    int damage;
    int health;
    int weight;

    fighter(String name, int damage, int health, int weight){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
    }
    int hit(fighter foe){
        System.out.println(this.name +"=>"+foe.name+" "+ this.damage+" hasar vurdu");
        if(foe.health-this.damage<0){
            return 0;
        }
        return (foe.health-this.damage);

    }

}
