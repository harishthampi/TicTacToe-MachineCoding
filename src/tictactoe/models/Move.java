package tictactoe.models;

public class Move {
    private Player player;
    private Cell cell;1

    public Move(Player player, Cell cell) {
        this.player = player;
        this.cell = cell;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cell getCells() {
        return cell;
    }

    public void setCells(Cell cell) {
        this.cell = cell;
    }
}
