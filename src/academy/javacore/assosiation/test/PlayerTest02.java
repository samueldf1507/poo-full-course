package academy.javacore.assosiation.test;

import academy.javacore.assosiation.domain.Player;
import academy.javacore.assosiation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player = new Player("Pelé");
        Team team = new Team("Seleção Brasileira");

        player.setTeam(team);
        player.printPlayerInformations();

    }
}
