package tictactoe.models;

import tictactoe.exception.InvalidGameConstructionParametersException;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private int nextPlayerIndex;
    private GameWinningStrategy gameWinningStrategy;
    private GameStatus gameStatus;
    private Player winner;

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
    private void Game(){
    }
    public static Builder getBuilder(){
        return new Builder();
    }




    public static class Builder{
        private int dimension;
        private List<Player> players;

        public int getDimension() {
            return dimension;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        private boolean validation() throws InvalidGameConstructionParametersException {
            if (this.dimension<3){
                throw new InvalidGameConstructionParametersException("The dimension cannot be less than 3");
            }
            if(this.players.size()!=this.dimension-1){
                throw new InvalidGameConstructionParametersException("The number of players should be equal to dimension-1");
            }
        }
        public Game build(){
            //validation
            //validation();
            Game game = new Game();
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setMoves(new ArrayList<>());
            game.setNextPlayerIndex(0);
            game.setPlayers(players);
            return game;
        }
    }
}
