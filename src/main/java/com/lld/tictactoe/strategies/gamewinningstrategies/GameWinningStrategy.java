package com.lld.tictactoe.strategies.gamewinningstrategies;

import com.lld.tictactoe.models.Board;
import com.lld.tictactoe.models.Cell;

public interface GameWinningStrategy {
    boolean checkIfWon(Board board, Cell lastMovedCell);
}
