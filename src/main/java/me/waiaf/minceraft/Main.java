package me.waiaf.minceraft;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        ItemManager.init();

    }

}
