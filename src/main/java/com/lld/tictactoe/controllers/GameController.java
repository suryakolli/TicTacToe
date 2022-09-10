package com.lld.tictactoe.controllers;

import com.lld.tictactoe.exceptions.EmptyMovesUndoException;
import com.lld.tictactoe.factories.PlayerFactory;
import com.lld.tictactoe.models.*;
import com.lld.tictactoe.strategies.botplayingstrategies.RandomBotPlayingStrategy;
import com.lld.tictactoe.strategies.gamewinningstrategies.GameWinningStrategy;
import com.lld.tictactoe.strategies.gamewinningstrategies.OrderOneGameWinningStrategy;

import java.util.List;

public class GameController {
    // TODO implement these methods
    public Game createGame(int dimensionOfBoard, List<Player> players, List<GameWinningStrategy> strategies) {
        Game game = null;
        try {
            game = Game.create()
                    .withBoard(new Board(dimensionOfBoard))
                    .addPlayers(players)
                    .addGameWinningStrategies(strategies)
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return game;
    }

    public MoveResult makeMove(Game game, Move move) {
        return MoveResult.Failure;
    }

    public boolean undo(Game game) {
        try {
            return game.undo();
        } catch (EmptyMovesUndoException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Player getWinner(Game game) {
        return null;
    }

    public GameStatus getGameStatus(Game game) {
        return GameStatus.IN_PROGRESS;
    }
}
