package MaçQuizi;

public abstract class SporDallari {

     public void Sport_Start(TeamClass t1,TeamClass t2){
      t1.gol=0;
      t2.gol=0;
     }
     public abstract void find_score();
     public abstract void  t1Win();
     public abstract void t2Win();
     public abstract  int getplayerNumber(String Sport_Name);




}
