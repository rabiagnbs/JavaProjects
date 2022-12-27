package MaçQuizi;

public class MAC extends SporDallari{
    public String Sport_Name;
    TeamClass t1= new TeamClass("takım 1");
    TeamClass t2= new TeamClass("takım 2");

    public MAC(String sport_Name, TeamClass t1, TeamClass t2) {
        this.Sport_Name = sport_Name;
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public void find_score() {
        if(t1.gol > t2.gol){
            System.out.println(t1.takimIsmi+"takimi"+t1.gol+"-"+t2.gol+t2.takimIsmi+"takimini kazandi");
        }
        else if(t1.gol < t2.gol){
            System.out.println(t2.takimIsmi+" takimi "+t2.gol+" - "+t1.gol+ t1.takimIsmi+" takimini kazandi");
        }
        else{
            System.out.println(t1.takimIsmi+ " ve " +t2.takimIsmi+ " takimlari berabere kaldilar.");
        }
    }

    @Override
    public void t1Win() {
         t1.gol++;
    }

    @Override
    public void t2Win() {
        t2.gol++;
    }

    @Override
    public int  getplayerNumber(String Sport_Name) {

          if(Sport_Name.equals("Futbol")){
              return 11;
          }
          else if(Sport_Name.equals("Basketbol")){
              return 12;
          }
          else{
              return -1;
          }


    }
}
