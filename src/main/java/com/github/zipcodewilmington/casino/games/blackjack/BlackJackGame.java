package com.github.zipcodewilmington.casino.games.blackjack;


import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.WagingGame;

import java.util.List;

public class BlackJackGame extends WagingGame implements GameInterface<BlackJackPlayer> {
    Boolean isCardGame = true;

    @Override
    public Boolean isOver() {
        return null;
    }

    @Override
    public void addPlayer(BlackJackPlayer player) {

    }

    @Override
    public void addPlayers(List<? extends BlackJackPlayer> player) {

    }

    @Override
    public void evaluateTurn(BlackJackPlayer player) {

    }

    @Override
    public void remove(BlackJackPlayer player) {

    }

    @Override
    public void run() {

    }
}
