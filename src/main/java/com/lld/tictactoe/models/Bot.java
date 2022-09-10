package com.lld.tictactoe.models;

import com.lld.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;

public class Bot extends Player{
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(Symbol symbol, BotPlayingStrategy botPlayingStrategy) {
        super(PlayerType.BOT, symbol);
        this.botPlayingStrategy = botPlayingStrategy;
    }
}
