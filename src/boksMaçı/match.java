package boksMaçı;

public class match {
    fighter f1;
    fighter f2;
    int minWeight;
    int maxWeight;

    match(fighter f1, fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    void run(){
        if (isCheck()) {
            while(this.f1.health > 0 && this.f2.health > 0 ){
                System.out.println("======Yeni Raund======");
                int chance = Math.round((float) Math.random());
                if(chance==0){
                    f2.health=f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    f1.health=f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                }
                else if (chance == 1) {
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }

                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }


                System.out.println(this.f1.name +" Sağlık:"+this.f1.health);
                System.out.println(this.f2.name +" Sağlık:"+this.f2.health);

            }
        }
        else{
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
        }
    }
     boolean isCheck(){
        return ((this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight));
     }

     boolean isWin(){
        if(f1.health==0){
            System.out.println("kazanann:"+this.f2.name);
            return true;
        }
        if(f2.health==0){
            System.out.println("kazanannn:"+this.f1.name);
            return true;
        }
        return false;
     }


}
