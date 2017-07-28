package com.example.android.playerstate.StatePlayer;

import com.example.android.playerstate.Player;

public class RaddyState extends State {
    public RaddyState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.setState(new LockedState(player));
        return "Выключился";
    }

    @Override
    public String onPlay() {
        String action = player.startPlayback();
        player.setState(new PlayingState(player));
        return "Играю " + action;
    }

    @Override
    public String onNext() {
        return "Вначале запусти меня";
    }

    @Override
    public String onPrevious() {
        return "Вначале запусти меня";
    }
}
