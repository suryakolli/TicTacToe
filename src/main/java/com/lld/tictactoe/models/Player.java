package com.lld.tictactoe.models;

public abstract class Player {
    private Symbol symbol;

    public PlayerType getPlayerType() {
        return playerType;
    }

    private PlayerType playerType;

    Player(PlayerType type, Symbol symbol) {
        this.playerType = type;
        this.symbol = symbol;
    }
}
