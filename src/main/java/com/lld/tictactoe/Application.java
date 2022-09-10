package com.lld.tictactoe;

import com.lld.tictactoe.controllers.GameController;
import com.lld.tictactoe.factories.PlayerFactory;
import com.lld.tictactoe.models.*;
import com.lld.tictactoe.strategies.botplayingstrategies.RandomBotPlayingStrategy;
import com.lld.tictactoe.strategies.gamewinningstrategies.GameWinningStrategy;
import com.lld.tictactoe.strategies.gamewinningstrategies.OrderOneGameWinningStrategy;

import java.util.List;

public class Application {
    private static GameController gameController = new GameController();

    public static void main(String[] args) {
        int gameDimension = 3;
        List<Player> players = List.of(
                PlayerFactory.getHuman(new Symbol('O'), new User()),
                PlayerFactory.getBot(new Symbol('X'), new RandomBotPlayingStrategy())
        );
        List<GameWinningStrategy> gameWinningStrategies = List.of(
                new OrderOneGameWinningStrategy()
        );

        Game g1 = gameController.createGame(gameDimension, players, gameWinningStrategies);

    }
}
