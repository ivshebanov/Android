package com.example.android.playerstate;

import com.example.android.playerstate.StatePlayer.LockedState;
import com.example.android.playerstate.StatePlayer.State;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private State state;
    private List<String> music;
    private int currentTrack;

    public Player() {
        setState(new LockedState(this));
        music = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            this.music.add("Track_" + i);
        }
        this.currentTrack = 1;
    }

    public String startPlayback() {
        return music.get(this.currentTrack);
    }

    public String onNext() {
        if (this.currentTrack == 19) {
            this.currentTrack = 0;
        } else {
            this.currentTrack += 1;
        }
        return music.get(this.currentTrack);
    }

    public String onPrevious() {
        if (this.currentTrack == 0) {
            this.currentTrack = 19;
        } else {
            this.currentTrack -= 1;
        }
        return music.get(this.currentTrack);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
