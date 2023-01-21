package magaza;

public class mudur extends calisan {
    private final static int CIPLAK_MAASI = 2000;
    private final static int PRIM_LIMITI = 20000;
    private int satis;
    public mudur(String ad, String soyad){
        super(ad,soyad);
    }
    public void setToplamSatis(int satis) {
        this.satis = satis;
    }
    public int MaasHesapla(){
          if(this.satis>mudur.PRIM_LIMITI){
              return CIPLAK_MAASI+
                      (satis-PRIM_LIMITI)/10;
          }
          return CIPLAK_MAASI;
    }
    public String kimimBen(){
        return "Mudur: ";
    }

}
