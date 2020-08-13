package io.github.ann0y1nghacker.plugin.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;


public class OnPlayerChat implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        if (e.getPlayer().getName().equals("ANN0Y1NGHACKER")) {
            e.getPlayer().setPlayerListName(" [" + ChatColor.AQUA + "DEV" + ChatColor.WHITE + "] " + ChatColor.AQUA + e.getPlayer().getName() + " ");
            e.getPlayer().setDisplayName("[" + ChatColor.AQUA + "DEV" + ChatColor.WHITE + "] " + ChatColor.AQUA + e.getPlayer().getName());
            e.setFormat(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + e.getMessage());
        }
    }
}
