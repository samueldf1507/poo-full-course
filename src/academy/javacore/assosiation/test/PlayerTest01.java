package academy.javacore.assosiation.test;

import academy.javacore.assosiation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Messi");
        Player player2 = new Player("CR7");
        Player player3 = new Player("Neymar");
        Player[] players = {player1, player2, player3};
        for (Player player: players) {
            System.out.println(player.getName());
        }
    }
}
