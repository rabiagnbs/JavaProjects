package MaçQuizi;

public class main {
    public static void main(String[] args) {
        TeamClass t1 =new TeamClass("takım 1");
        TeamClass t2 =new TeamClass("takım 2");
         MAC F=new MAC("Futbol",t1,t2);
        System.out.println("Bir "+ F.Sport_Name+" takiminda "+F.getplayerNumber(F.Sport_Name)+" oyuncu vardır");
        F.Sport_Start(t1,t2);
        F.t1Win();
        F.t2Win();
        F.t2Win();
        F.t2Win();
        F.find_score();
    }
}
