package magaza;

public class idariPersonel extends calisan{
    private static final int MAAS = 800;

    public idariPersonel(String ad, String soyad){
        super(ad, soyad);
    }
    public int MaasHesapla() {
        return idariPersonel.MAAS;
    }
    public String kimimBen() {
        return "İdari Personel";
    }

}
