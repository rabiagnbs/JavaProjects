package LabOrnek;

public class Kedi extends Hayvan implements IEvcilHayvan {
    public String isim;

    public Kedi(String isim) {
        this.isim = isim;
    }

    @Override
    public void yuru(){
        System.out.println("Kediler dört ayaklarıyla yürürler.");
    }
    @Override
    public void yemekYe(){
        System.out.println("Kediler genellikle mama yerler");
    }
    @Override
    public void setIsim(String isim){
        System.out.println(this.isim+" kedi ismidir.");
    }
    @Override
    public String getIsim(){
        return this.isim;
    }
    @Override
    public void oyunOyna(){
        System.out.println("Kediler iplerle oynarlar.");
    }
}
