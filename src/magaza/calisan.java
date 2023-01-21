package magaza;

public abstract class calisan {
    private String ad;
    private String soyad;
    public calisan(String ad, String soyad){
        this.ad=ad;
        this.soyad=soyad;
    }

    public String getAd(){
        return this.ad;
    }
    public String getSoyad(){
        return this.soyad;
    }
    public abstract int  MaasHesapla();

    public String bilgiVer(){
        return kimimBen()+getAd()+ getSoyad()+ " bu yıl " +MaasHesapla()+" tl maaş alacak.";
    }
    public abstract String kimimBen();


}
