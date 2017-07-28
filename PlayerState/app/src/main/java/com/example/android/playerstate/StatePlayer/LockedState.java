package com.example.android.playerstate.StatePlayer;

import com.example.android.playerstate.MainActivity;
import com.example.android.playerstate.Player;
import com.example.android.playerstate.R;

public class LockedState extends State {

    public LockedState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.setState(new RaddyState(player));
        return "Включился";
    }

    @Override
    public String onPlay() {
        return "Не могу играть, я выключен.";
    }

    @Override
    public String onNext() {
        return "Я не переключаю треки в выключенном состоянии(next)";
    }

    @Override
    public String onPrevious() {
        return "Я не переключаю треки в выключенном состоянии(previous)";
    }
}
