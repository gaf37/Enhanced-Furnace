package alostor.play.minesend.fun.Play.minesend;

import org.bukkit.block.Furnace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class MyListeren implements Listener {
    @EventHandler
    public void on(BlockPlaceEvent e) {
        Furnace furnace = (Furnace) e.getBlock().getState();
        furnace.setCookSpeedMultiplier(5);
        furnace.update();
    }
}
