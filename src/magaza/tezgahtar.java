package magaza;

public class tezgahtar extends calisan{
    private int satis;
    public tezgahtar(String ad, String soyad){
        super(ad,soyad);
    }
    public int MaasHesapla(){
        return this.satis/10;
    }
    public String kimimBen(){
        return "Tezgahtar: ";
    }
    public void setSatis(int satis){
        this.satis=satis;
    }
}
