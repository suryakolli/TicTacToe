package com.lld.tictactoe.models;

public class Human extends Player{
    private User user;

    public Human(Symbol symbol, User user){
        super(PlayerType.HUMAN, symbol);
        this.user = user;
    }
}
