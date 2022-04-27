package players;


import sportsclubs.SportsClub;
import tasks.Task;


public abstract class Player {
    private String name;

    private String position;
    private int number;
    private int wage;
    protected SportsClub sportsClub;


    public Player (String name, String position, int number, int wage, SportsClub sportsClub) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.wage = wage;
        this.setTeam(sportsClub);

    }

    public void setTeam (SportsClub sportsClub) {
        this.sportsClub = sportsClub;
    }



    public abstract Task scoringMethod();

    public abstract Task scoringMethod(Task task);



}
