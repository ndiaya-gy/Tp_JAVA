package refactoring;

public class TestTennisGame {
    public static void main(String[] args) {

        TennisGame game = new TennisGameRefactored("player1", "player2");

        game.wonPoint("player1");
        System.out.println(game.getScore()); 

        game.wonPoint("player2");
        System.out.println(game.getScore()); 

        game.wonPoint("player1");
        game.wonPoint("player1");
        System.out.println(game.getScore()); 

        game.wonPoint("player2");
        game.wonPoint("player2");
        System.out.println(game.getScore()); 

        game.wonPoint("player1");
        System.out.println(game.getScore()); 

        game.wonPoint("player1");
        System.out.println(game.getScore()); 
    }
}
