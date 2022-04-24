package lld.tictactoe;

import java.util.concurrent.ThreadLocalRandom;

public class Computer implements Player {
    private final char symbol;

    public Computer(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public Move play() {
        int x = (int) (Math.random()%3);
        int y = (int) (Math.random()%3);
        System.out.println("computer moves"+": "+x+","+y);
        return new Move(x, y);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
