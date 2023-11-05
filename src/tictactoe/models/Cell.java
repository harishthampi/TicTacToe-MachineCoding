package tictactoe.models;

public class Cell {
    private int row;
    private int column;
    private Player player;
    private Cellstatus cellstatus;
    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }


    public void setColumn(int column) {
        this.column = column;
    }

    public Cellstatus getCellstatus() {
        return cellstatus;
    }

    public void setCellstatus(Cellstatus cellstatus) {
        this.cellstatus = cellstatus;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
