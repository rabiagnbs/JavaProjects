package LabOrnek;

public class main {
    public static void main(String[] args) {
        Goril g=new Goril();
        Kedi k=new Kedi("Pamuk");
        Kopek ko=new Kopek("Safari");
        k.setIsim("Pamuk");
        k.getIsim();
        k.yuru();
        g.yemekYe();
        ko.setIsim("Safari");
        ko.getIsim();
        ko.getAyakSayisi();
    }
}
