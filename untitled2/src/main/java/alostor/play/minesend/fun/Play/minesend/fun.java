package alostor.play.minesend.fun.Play.minesend;

import org.bukkit.Material;
import org.bukkit.block.Furnace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class fun extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("funcer").setExecutor(new Bake());
        getServer().getPluginManager().registerEvents(new MyListeren(),this);


    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
