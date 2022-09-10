package com.lld.tictactoe.strategies.gamewinningstrategies;

import com.lld.tictactoe.models.Board;
import com.lld.tictactoe.models.Cell;

public class OrderOneGameWinningStrategy implements GameWinningStrategy{

    @Override
    public boolean checkIfWon(Board board, Cell lastMovedCell) {
        return false;
    }
}
