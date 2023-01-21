package magaza;

public class mudur {
    private String ad;
    private String soyad;
    private int maas;

    public mudur(String ad, String soyad){
        this.ad=ad;
        this.soyad=soyad;

    }
    public String getAd(){
        return this.ad;
    }
    public void setAd(String ad){
        this.ad=ad;
    }
    public String getSoyad(){
        return this.soyad;
    }
    public void setSoyad(){
        this.soyad=soyad;
    }
    public int getMaas(){
        return this.maas;
    }
    public void setMaas(int maas){
        this.maas=maas;
    }

    public String getBilgi(){
        return "Mudur: "+ getAd()+ getSoyad()+", bu ay "+ getMaas()+" ytl alacaktir.";
    }
}
