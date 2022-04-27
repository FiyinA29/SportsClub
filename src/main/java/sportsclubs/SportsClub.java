package sportsclubs;

import interfaces.IPassForward;
import players.Player;
import tasks.BasketballTask;
import tasks.FootballTask;
import tasks.RugbyTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SportsClub {

    protected List<Player> players = new ArrayList<>();
    protected LinkedList<FootballTask> footballObjectives = new LinkedList<>();
    protected LinkedList<RugbyTask> rugbyObjectives = new LinkedList<>();
    protected LinkedList<BasketballTask> basketballObjectives = new LinkedList<>();
    protected List<IPassForward> forwardPassers;


    public SportsClub () {
        this.players = new ArrayList<>();
        this.forwardPassers = new ArrayList<>();
    }

    public void addPlayer (Player player){
        this.players.add(player);
    }


    public List<Player> getPlayers() {
        return this.players;
    }

    public LinkedList<FootballTask> getFootballObjectives() {
        return footballObjectives;
    }

    public LinkedList<RugbyTask> getRugbyObjectives() {
        return rugbyObjectives;
    }

    public LinkedList<BasketballTask> getBasketballObjectives() {
        return basketballObjectives;
    }

    public void addForwardPassers (IPassForward forwardPasser) {
        this.forwardPassers.add(forwardPasser);

    }

    public int forwardPassersCount () {
        return this.forwardPassers.size();
    }


}

