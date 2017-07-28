package com.example.android.playerstate.StatePlayer;

import com.example.android.playerstate.Player;

public abstract class State {
    public Player player;

    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
