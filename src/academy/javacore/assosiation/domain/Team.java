package academy.javacore.assosiation.domain;

public class Team {
    private String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;
    }

    public Team(Player[] players, String name) {
        this.players = players;
        this.name = name;
    }

    public void printTeamInformations() {
        System.out.println("Nome do time: " + this.name);
        if (players == null) return;
        for (Player player: players) {
            System.out.println(player.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
