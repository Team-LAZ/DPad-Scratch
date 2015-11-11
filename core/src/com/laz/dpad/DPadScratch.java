package com.laz.dpad;

import com.badlogic.gdx.Game;

public class DPadScratch extends Game {
	
	@Override
	public void create () {
        setScreen(new GameScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
}
