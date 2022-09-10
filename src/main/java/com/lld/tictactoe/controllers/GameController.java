package com.lld.tictactoe.controllers;

import com.lld.tictactoe.models.Game;
import com.lld.tictactoe.models.GameStatus;
import com.lld.tictactoe.models.Move;
import com.lld.tictactoe.models.Player;

public class GameController {
    // TODO implement these methods
    public Game createGame() {
        return null;
    }

    public MoveResult makeMove(Game game, Move move) {
        return MoveResult.Failure;
    }

    public boolean undo(Game game) {
        return false;
    }

    public Player getWinner(Game game) {
        return null;
    }

    public GameStatus getGameStatus(Game game) {
        return GameStatus.IN_PROGRESS;
    }
}
