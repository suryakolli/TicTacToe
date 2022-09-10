package com.lld.tictactoe.strategies.botplayingstrategies;

import com.lld.tictactoe.models.Board;
import com.lld.tictactoe.models.Move;
import com.lld.tictactoe.models.Symbol;

public interface BotPlayingStrategy {
    Move makeNextMove(Board board, Symbol symbol);
}
