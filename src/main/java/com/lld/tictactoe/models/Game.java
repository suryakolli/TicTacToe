package com.lld.tictactoe.models;

import com.lld.tictactoe.exceptions.MultipleBotsException;
import com.lld.tictactoe.strategies.gamewinningstrategies.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private List<GameWinningStrategy> gameWinningStrategies;
    private int lastMovedPlayerIndex;
    private GameStatus gameStatus;
    private Player winner;

    public static Builder create() {
        return new Builder();
    }

    public static class Builder {
        private List<Player> players = new ArrayList<>();
        private Board board;
        private List<Move> moves;
        private List<GameWinningStrategy> gameWinningStrategies = new ArrayList<>();
        private int lastMovedPlayerIndex;
        private GameStatus gameStatus;
        private Player winner;


        public Builder addPlayer(Player player) {
            this.players.add(player);
            return this;
        }

        public Builder addPlayers(List<Player> players) {
            for(Player player: players) {
                this.players.add(player);
            }
            return this;
        }

        public Builder withBoard(Board board) {
            this.board = board;
            return this;
        }


        public Builder addGameWinningStrategies(GameWinningStrategy gameWinningStrategy) {
            this.gameWinningStrategies.add(gameWinningStrategy);
            return this;
        }

        private boolean checkIfSingleBotMax() {
            int count = 0;

            for(Player player: players) {
                if(player.getPlayerType().equals(PlayerType.BOT)) {
                    count += 1;
                }
            }

            return count <= 1;
        }

        public Game build() throws MultipleBotsException{
            if(!checkIfSingleBotMax()) {
                throw new MultipleBotsException();
            }
            return null;
        }

        // TODO Implement the builder class to be fully functional
        // 1. implement the build method
        // 2. handle all validation scenarios.
        //      - only one bot -  DONE
        //      - no two players with same symbol
    }
}
