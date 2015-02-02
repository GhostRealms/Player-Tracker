package com.rmarmorstein.PlayerTracker.Banlist;

import com.rmarmorstein.PlayerTracker.PlayerTracker;

import java.util.UUID;

public abstract class Banlist {
	
	PlayerTracker plugin;
	
	public abstract boolean isBanned( UUID uuid );
	
}
