package io.github.ann0y1nghacker.plugin;

import io.github.ann0y1nghacker.plugin.commands.test;
import io.github.ann0y1nghacker.plugin.events.OnPlayerChat;
import io.github.ann0y1nghacker.plugin.events.OnPlayerJoin;
import io.github.ann0y1nghacker.plugin.events.OnPlayerLeave;
import io.github.ann0y1nghacker.plugin.modules.recipes;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        new recipes(this);

        System.out.println(" \n" +
                "/* ======================================================= */\n" +
                "/*                                                         */\n" +
                "/*       © Copyright 2020 - ANN0Y1NGHACKER's Plugins       */\n" +
                "/*                                                         */\n" +
                "/* ======================================================= */\n"
        );

//        Objects.requireNonNull(getCommand("test")).setExecutor(new test());

        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerLeave(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerChat(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }
}
