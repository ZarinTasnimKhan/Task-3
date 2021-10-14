package zarintasnim;

public class Cricket extends Sports {

    String matchType;
    int over;
    Player player;

    Cricket(String matchType, int over,Player player ){
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }
    void display(){
        System.out.println("MatchType :"+matchType);
        System.out.println("Over :"+over);
        System.out.println("Player Name :"+player.playerName);
        System.out.println("jerseyNumber :"+player.jerseyNumber);
    }
}
/*
      Name: Zarin Tasnim Khan
      ID : 2012020178
      Section : D
      Email : cse_2012020178@lus.ac.bd
      Date : 12.09.2021
*/