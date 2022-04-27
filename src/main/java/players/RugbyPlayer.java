package players;

import sportsclubs.SportsClub;
import tasks.Task;

public class RugbyPlayer extends Player{

    public RugbyPlayer(String name, String position, int number, int wage, SportsClub sportsClub)    {
        super(name, position, number, wage, sportsClub);
    }

    @Override
    public Task scoringMethod() {
        Task task = this.sportsClub.getRugbyObjectives().pop();
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
}
