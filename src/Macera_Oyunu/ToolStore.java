package Macera_Oyunu;

public class ToolStore extends NormalLocation{
    public ToolStore(Player player) {
        super(player);
    }
    @Override
     public boolean onLocation(){
        System.out.println("Mağazaya Hoşgeldiniz!");
        System.out.println("1-)Silahlar" +
                "\n 2-)Zırhlar"+
                "\n 3-)Çıkış yap.");
        System.out.println("Seçiminiz:");
        int selectCase=input.nextInt();
        while(selectCase <1 || selectCase>3 ){
            System.out.println("Hatalı seçim yaptınız.Tekrar deneyiniz.");
            selectCase=input.nextInt();
        }
        switch(selectCase){
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("çıkış yapılıyor...Yine Bekleriz.");
                break;
        }
        return true;
    }

    public void menu(){

    }
    public void buy(){

    }
    public void printWeapon(){
    }
    public void printArmor(){

    }
}
