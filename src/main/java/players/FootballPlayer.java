package players;

import interfaces.IPassForward;
import sportsclubs.SportsClub;
import tasks.Task;

public class FootballPlayer extends Player implements IPassForward {

    public FootballPlayer(String name, String position, int number, int wage, SportsClub sportsClub)    {
        super(name, position, number, wage, sportsClub);
    }

    @Override
    public Task scoringMethod() {
        Task task = this.sportsClub.getFootballObjectives().pop();
        System.out.println(task.getDescription());
        task.setIsComplete(true);
        return task;
    }

    @Override
    public Task scoringMethod(Task task) {
        System.out.println(task.getDescription()); // do the job
        task.setIsComplete(true);
        return task;
    }

    @Override
    public String passForward(int numberOfPasses) {
        return "This player made " + numberOfPasses + " forward passes";
    }
}
