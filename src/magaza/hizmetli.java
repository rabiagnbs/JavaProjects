package magaza;

public class hizmetli {
    private String ad;
    private String soyad;
    private int maas;

    public hizmetli(String ad, String soyad){
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
        return "Hizmetli: "+ this.ad+ this.soyad+", bu ay "+ this.maas+" ytl alacaktir.";
    }
}
