package LabOrnek;

public  abstract class Hayvan {
    private int ayakSayisi;

    abstract void yuru();
    abstract void yemekYe();

    public int getAyakSayisi(){
        return this.ayakSayisi;
    }
    public void setAyakSayisi(int ayakSayisi){
        ayakSayisi=this.ayakSayisi;
    }

}
