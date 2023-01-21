package magaza;

public class main {
    private final static int MUDUR_CIPLAK_MAASI = 2000;
    private final static int MUDUR_PRIM_LIMITI = 20000;
    private final static int HIZMETLI_SAATLIK_UCRET= 10;
    private final static int IDARI_PERSONEL_MAASI = 800;

    public static void main(String[] args) {

        hizmetli[] hizmetli=new hizmetli[2];
        hizmetli[0]= new hizmetli("ali ","ışık");
        hizmetli[0].setMaas(HIZMETLI_SAATLIK_UCRET*60);
        hizmetli[1]=new hizmetli("ahmet ","ateş");
        hizmetli[1].setMaas(HIZMETLI_SAATLIK_UCRET*40);

        idariPersonel[] idariPersonel=new idariPersonel[2];
        idariPersonel[0]=new idariPersonel("ayşe ","demir");
        idariPersonel[0].setMaas(IDARI_PERSONEL_MAASI);
        idariPersonel[1]=new idariPersonel("mehmet ","çelik");
        idariPersonel[1].setMaas(IDARI_PERSONEL_MAASI);


        tezgahtar[] tezgahtar=new tezgahtar[2];
        tezgahtar[0]=new tezgahtar("okan ","yeşil");
        tezgahtar[0].setMaas(15000/10);
        tezgahtar[1]=new tezgahtar("burcu ","seğmen");
        tezgahtar[1].setMaas(22000/10);

        mudur mudur=new mudur("rabia ","günbaş");
        mudur.setMaas((37000-MUDUR_PRIM_LIMITI)/10 + MUDUR_CIPLAK_MAASI);

        System.out.println("Çalışanların maaşları");
        for(int i=0; i<hizmetli.length; i++){
            System.out.println(hizmetli[i].getBilgi());
        }
        for(int i=0; i<idariPersonel.length; i++){
            System.out.println(idariPersonel[i].getBilgi());
        }
        for(int i=0; i<tezgahtar.length; i++){
            System.out.println(tezgahtar[i].getBilgi());
        }
        System.out.println(mudur.getBilgi());

    }
}
