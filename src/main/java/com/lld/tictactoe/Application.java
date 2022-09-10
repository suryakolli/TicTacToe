package com.lld.tictactoe;

import com.lld.tictactoe.factories.PlayerFactory;
import com.lld.tictactoe.models.*;
import com.lld.tictactoe.strategies.botplayingstrategies.RandomBotPlayingStrategy;
import com.lld.tictactoe.strategies.gamewinningstrategies.OrderOneGameWinningStrategy;

public class Application {
    public static void main(String[] args) {
        Game game;
        try {
            game = Game.create()
                    .withBoard(new Board(3))
                    .addPlayer(PlayerFactory.getHuman(new Symbol('O'), new User()))
                    .addPlayer(PlayerFactory.getBot(new Symbol('X'), new RandomBotPlayingStrategy()))
                    .addGameWinningStrategies(new OrderOneGameWinningStrategy())
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
