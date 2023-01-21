package magaza;

public class hizmetli extends calisan {
    private static final int SAAT_UCRETI = 10;
    private int mesaiSaati;
    public hizmetli(String ad, String soyad){
        super(ad, soyad);
    }
    public void setMesaiSaati(int mesaiSaati) {
        this.mesaiSaati = mesaiSaati;
    }
    public int MaasHesapla() {
        return this.mesaiSaati * hizmetli.SAAT_UCRETI;
    }
    public String kimimBen() {
        return "Hizmetli";
    }

}
