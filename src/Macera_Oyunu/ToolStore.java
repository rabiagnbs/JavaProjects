package Macera_Oyunu;

public class ToolStore extends NormalLocation{
    public ToolStore(Player player) {
        super(player,"Mağazadasınız");
    }
    @Override
     public boolean onLocation() {
        System.out.println("Mağazaya Hoşgeldiniz!");
        System.out.println(" 1-)Silahlar" +
                "\n 2-)Zırhlar" +
                "\n 3-)Çıkış yap.");
        System.out.println("Seçiminiz:");
        int selectCase = input.nextInt();
        while (selectCase < 1 || selectCase > 3) {
            System.out.println("Hatalı seçim yaptınız.Tekrar deneyiniz.");
            selectCase = input.nextInt();
        }
        boolean showMenu=true;
        while (true) {
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("çıkış yapılıyor...Yine Bekleriz.");
                    showMenu=false;
                    return true;
            }
            return true;
        }
    }

    public void menu(){

    }
    public void buy(){

    }
    public void printWeapon(){
        System.out.println("-----Silahlar-----");
        for(Weapon w: Weapon.weapons()){
              System.out.println(w.getName()+"ID"+w.getId()+"Para:"+w.getPrice()+"Hasar:"+w.getDamage());
        }
        System.out.println("0-) Çıkış yapılıyor.");

    }
    public void buyWeapon(){
        System.out.println("lutfen bir silah seciniz:");
        int selectWeaponID=input.nextInt();
        while(selectWeaponID <0 || selectWeaponID> Weapon.weapons().length){
            System.out.println("Gecersiz secim, lutfen tekrar giriniz.");
            selectWeaponID=input.nextInt();
        }
        if(selectWeaponID!=0){
            Weapon selectedWeapon=Weapon.getweaponobjById(selectWeaponID);
            if(selectedWeapon != null){
                if(selectedWeapon.getPrice()<=this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız vardır.İşlem tamamlandı.\n");
                    int balance=this.getPlayer().getMoney()-selectedWeapon.getPrice();
                    System.out.println("Kalan paranız:"+balance+"\n");
                    System.out.println("Onceki silahınız:"+this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Sonraki silahınız:"+this.getPlayer().getInventory().getWeapon().getName());

                }
                else{
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                }
            }
        }


    }

    public void buyArmor(){
        System.out.println("Lutfen bir zırh seciniz.");
        int selectArmorID=input.nextInt();
        while(selectArmorID<0 || selectArmorID>Armor.armors().length){
            System.out.println("Gecersiz secim yaptınız. Lütfen tekrar deneyiniz.");
            selectArmorID=input.nextInt();
        }
        if(selectArmorID != 0){
            Armor selectedArmor=Armor.getarmorobjById(selectArmorID);
            if(selectedArmor != null){
                if(selectedArmor.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız yoktur.");
                }
                else{
                    System.out.println("yeterli paranız vardır.");
                    int balance=this.getPlayer().getMoney()-selectedArmor.getPrice();
                    System.out.println("Kalan Bakiyeniz:"+balance);
                    System.out.println("Onceki zırhınız:"+this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Şimdiki zırhınız:"+this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }

    }
    public void printArmor(){
         System.out.println("-----Zırhlar-----");
        for(Armor a: Armor.armors()){
            System.out.println(a.getName()+" ID"+a.getId()+" Engelleme:"+a.getBlock()+" Para:"+a.getPrice());
        }
        System.out.println("0-) Çıkış yapılıyor.");
    }
}
