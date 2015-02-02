package com.rmarmorstein.PlayerTracker.Banlist;

import com.rmarmorstein.PlayerTracker.PlayerTracker;

import java.util.UUID;

public abstract class Banlist {
	PlayerTracker plugin;

	public boolean isBanned( UUID uuid ) {
		return false;
	}
	
	public boolean isFig() {
		return false;
	}
}
