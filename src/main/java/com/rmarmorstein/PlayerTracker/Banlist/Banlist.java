package com.rmarmorstein.PlayerTracker.Banlist;

import com.rmarmorstein.PlayerTracker.PlayerTracker;

public abstract class Banlist {
	PlayerTracker plugin;

	public boolean isBanned( String playername ) {
		return false;
	}
	
	public boolean isFig() {
		return false;
	}
}
