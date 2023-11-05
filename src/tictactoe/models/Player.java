package tictactoe.models;

public class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol, Playertype playertype) {
        this.name = name;
        this.symbol = symbol;
        this.playertype = playertype;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {

        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Playertype getPlayertype() {
        return playertype;
    }

    public void setPlayertype(Playertype playertype) {
        this.playertype = playertype;
    }

    private Playertype playertype;
    public Move decideMove(){
        return  null;
    }
}
