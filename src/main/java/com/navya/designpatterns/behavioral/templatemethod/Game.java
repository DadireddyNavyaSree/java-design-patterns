package com.navya.designpatterns.behavioral.templatemethod;

public abstract class Game {
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
}
