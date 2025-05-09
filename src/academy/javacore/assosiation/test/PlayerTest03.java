package academy.javacore.assosiation.test;

import academy.javacore.assosiation.domain.Player;
import academy.javacore.assosiation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Cafu");
        Player player2 = new Player("Pelé");
        Team team = new Team("Brasil");
        Player[] players = new Player[]{player1, player2};

        player1.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("--Jogador1--");
        player1.printPlayerInformations();

        System.out.println("--Jogador2--");
        player2.printPlayerInformations();

        System.out.println("--Time--");
        team.printTeamInformations();
    }
}
