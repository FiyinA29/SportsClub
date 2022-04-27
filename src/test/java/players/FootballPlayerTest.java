package players;

import interfaces.IPassForward;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sportsclubs.SportsClub;
import tasks.FootballTask;
import tasks.Task;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FootballPlayerTest {
    FootballPlayer footballPlayer;
    Task task;
    Team team = Team.Football;


    @BeforeEach
    public void setUp () {
        SportsClub sportsClub = new SportsClub();

        footballPlayer = new FootballPlayer("Reece James", "Defender", 24, 580000, sportsClub);

        sportsClub.getFootballObjectives().add(new FootballTask("Score a header"));
        sportsClub.getFootballObjectives().add(new FootballTask("Score a volley"));
        sportsClub.getFootballObjectives().add(new FootballTask("Score a direct free-kick"));

        task = new Task("Score a hat-trick");

    }


    @Test
    public void canSelectTask () { // Removes the task from the List<FootballTask> footballObjectives
        System.out.println(team + " match tasks:");
        footballPlayer.scoringMethod(task);
        footballPlayer.scoringMethod();
        footballPlayer.scoringMethod();
        assertThat(footballPlayer.sportsClub.getFootballObjectives().size()).isEqualTo(1);

    }

}
