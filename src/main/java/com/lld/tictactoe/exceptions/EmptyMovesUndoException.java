package com.lld.tictactoe.exceptions;

public class EmptyMovesUndoException extends Exception{
    public  EmptyMovesUndoException() {
        super("Undo operation is not supported when no moves are made.");
    }
}
