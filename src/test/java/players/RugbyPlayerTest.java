package players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sportsclubs.SportsClub;
import tasks.RugbyTask;
import tasks.Task;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RugbyPlayerTest {
    RugbyPlayer rugbyPlayer;
    Task task;
    Team team = Team.Rugby;

    @BeforeEach
    public void setUp () {
        SportsClub sportsClub = new SportsClub();

        rugbyPlayer = new RugbyPlayer("Maro Itoje", "Lock", 6, 15000, sportsClub);

        sportsClub.getRugbyObjectives().add(new RugbyTask("Score a try"));
        sportsClub.getRugbyObjectives().add(new RugbyTask("Score a conversion"));
        sportsClub.getRugbyObjectives().add(new RugbyTask("Score a drop gaol"));

        task = new Task("Score 5 try's");
    }

    @Test
    public void canSelectTask () { // Removes the task from the List<FootballTask> footballObjectives
        System.out.println(team + " match tasks:");
        rugbyPlayer.scoringMethod();
        rugbyPlayer.scoringMethod(task);
        rugbyPlayer.scoringMethod();
        assertThat(rugbyPlayer.sportsClub.getRugbyObjectives().size()).isEqualTo(1);
    }
}
