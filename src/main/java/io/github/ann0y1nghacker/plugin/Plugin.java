package io.github.ann0y1nghacker.plugin;

import io.github.ann0y1nghacker.plugin.modules.recipes;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new recipes(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
