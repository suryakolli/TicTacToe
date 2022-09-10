package com.lld.tictactoe.factories;

import com.lld.tictactoe.models.*;
import com.lld.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;

public class PlayerFactory {
    public static Player getBot(Symbol symbol, BotPlayingStrategy botPlayingStrategy) {
        return new Bot(symbol, botPlayingStrategy);
    }

    public static Player getHuman(Symbol symbol, User user) {
        return new Human(symbol, user);
    }

}
