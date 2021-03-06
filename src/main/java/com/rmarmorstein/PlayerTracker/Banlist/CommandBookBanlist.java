package com.rmarmorstein.PlayerTracker.Banlist;

import com.rmarmorstein.PlayerTracker.PlayerTracker;

import com.sk89q.commandbook.CommandBook;
import com.sk89q.commandbook.bans.BanDatabase;
import com.sk89q.commandbook.bans.BansComponent;

import java.util.UUID;


public class CommandBookBanlist extends Banlist {
	
	BanDatabase bandb;

	public CommandBookBanlist( PlayerTracker instance ) {
		this.plugin = instance;
		CommandBook bans_plugin = (CommandBook) this.plugin.getServer().getPluginManager().getPlugin("CommandBook");
		this.bandb = bans_plugin.getComponentManager().getComponent(BansComponent.class).getBanDatabase();
	}
	
	@Override
	public boolean isBanned( UUID uuid ) {
		return bandb.isBanned(uuid);
	}
}
