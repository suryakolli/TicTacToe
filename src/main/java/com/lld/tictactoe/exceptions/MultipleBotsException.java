package com.lld.tictactoe.exceptions;

public class MultipleBotsException extends Exception{
    public MultipleBotsException() {
        super("Cannot have more than one bot player in the game.");
    }
}
