package com.rmarmorstein.PlayerTracker.Banlist;

import com.rmarmorstein.PlayerTracker.PlayerTracker;

import java.util.UUID;

public class VanillaBanlist extends Banlist {
	
	public VanillaBanlist( PlayerTracker instance ) {
		this.plugin = instance;
	}
	
	@Override
	public boolean isBanned(UUID uuid) {
		if (plugin.getServer().getOfflinePlayer(uuid).isBanned()) return true;
		else return false;
	}
}
