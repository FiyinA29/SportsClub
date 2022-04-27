package players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sportsclubs.SportsClub;
import tasks.BasketballTask;
import tasks.Task;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BasketballPlayerTest {
    BasketballPlayer basketballPlayer;
    Task task;
    Team team = Team.Basketball;


    @BeforeEach
    public void setUp () {
        SportsClub sportsClub = new SportsClub();


        basketballPlayer = new BasketballPlayer("Chris Paul", "Point Guard", 3, 400000, sportsClub);

        sportsClub.getBasketballObjectives().add(new BasketballTask("Score a free throw"));
        sportsClub.getBasketballObjectives().add(new BasketballTask("Score a jump shot"));
        sportsClub.getBasketballObjectives().add(new BasketballTask("Score a slam dunk!"));

        task = new Task("Score double digit points");

    }

    @Test
    public void canSelectTask () { // Removes the task from the List<FootballTask> footballObjectives
        System.out.println(team + " match tasks:");
        basketballPlayer.scoringMethod();
        basketballPlayer.scoringMethod();
        basketballPlayer.scoringMethod(task); // ignores the last task in array list, and replaces it with specific task
        assertThat(basketballPlayer.sportsClub.getBasketballObjectives().size()).isEqualTo(1); // 1 task left in the array list
    }
}
