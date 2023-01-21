package magaza;

public class main {


    public static void main(String[] args) {
             calisan[] calisan =new calisan[7];

             calisan[0]=new mudur("rabia ", "günbaş");
             ((mudur)calisan[0]).setToplamSatis(37000);

             calisan[1]=new hizmetli("ali ","kaya");
             ((hizmetli)calisan[1]).setMesaiSaati(60);
             calisan[2]=new hizmetli("ahmet ","ateş");
             ((hizmetli)calisan[2]).setMesaiSaati(40);

             calisan[3]=new tezgahtar("okan ","yeşil");
             ((tezgahtar)calisan[3]).setSatis(15000);
             calisan[4]=new tezgahtar("burcu ","seğmen");
             ((tezgahtar)calisan[4]).setSatis(22000);

             calisan[5]=new idariPersonel("ayşe ","demir");
             calisan[6]=new idariPersonel("mehmet ","çevik");

             for(int i=0; i<calisan.length; i++){
                 System.out.println(calisan[i].bilgiVer());
             }

    }
}
