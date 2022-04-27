package sportsclubs;

import interfaces.IPassForward;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SportsClubTest {
    private SportsClub sportsClub;
    Player player;
    FootballPlayer footballPlayer;
    BasketballPlayer basketballPlayer;

    @BeforeEach
    public void setUp () {
        sportsClub = new SportsClub();

        sportsClub.addPlayer(new FootballPlayer("Mateo Kovacic", "Midfielder", 8, 150000, sportsClub));
        sportsClub.addPlayer(new RugbyPlayer("Manu Tuilagi", "Centre", 13, 10000, sportsClub));
        sportsClub.addPlayer(new BasketballPlayer("Steph Curry", "Point Guard", 30, 600000, sportsClub));

    }


    @Test
    public void addsPlayer() {
        assertThat(sportsClub.getPlayers().size()).isEqualTo(3);
        System.out.println(sportsClub);
    }

    @Test
    public void canMakeForwardPass () {
        sportsClub.addForwardPassers(footballPlayer);
        sportsClub.addForwardPassers(basketballPlayer);
        assertThat(sportsClub.forwardPassersCount()).isEqualTo(2);
    }


}
