package com.example.android.playerstate.StatePlayer;

import com.example.android.playerstate.Player;

public class PlayingState extends State {

    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.setState(new LockedState(player));
        return "Выключился";
    }

    @Override
    public String onPlay() {
        player.setState(new RaddyState(player));
        return "Пауза";
    }

    @Override
    public String onNext() {
        return "Следующий трек " + player.onNext();
    }

    @Override
    public String onPrevious() {
        return "Предыдущий трек " + player.onPrevious();
    }
}
