package com.rmarmorstein.PlayerTracker.Banlist;

import com.rmarmorstein.PlayerTracker.PlayerTracker;

import com.earth2me.essentials.Essentials;
import com.earth2me.essentials.User;
import org.bukkit.Bukkit;

import java.util.UUID;

public class EssentialsBanlist extends Banlist {
	
	private Essentials ess;
	
	public EssentialsBanlist( PlayerTracker instance ) {
		this.plugin = instance;
		this.ess = (Essentials) plugin.getServer().getPluginManager().getPlugin("Essentials");
	}
	
	@Override
	public boolean isBanned(UUID uuid) {
		User user = ess.getUser(Bukkit.getPlayer(uuid));
		if ( user == null )
			return false;
		return user.isBanned();
	}
}
