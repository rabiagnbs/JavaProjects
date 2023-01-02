package LabOrnek;

public class Kopek extends Hayvan implements IEvcilHayvan {
    public String isim;

    public Kopek(String isim) {
        this.isim = isim;
    }

    @Override
    public void yuru(){
        System.out.println("Kopekler dört ayaklarıyla yürürler.");
    }
    @Override
    public void yemekYe(){
        System.out.println("Kopekler genellikle mama yerler");
    }
    @Override
    public void setIsim(String isim){
        System.out.println(this.isim+" kopek ismidir.");
    }
    @Override
    public String getIsim(){
        return this.isim;
    }
    @Override
    public void oyunOyna(){
        System.out.println("Kopekler topla oynarlar.");
    }
}
