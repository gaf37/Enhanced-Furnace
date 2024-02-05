package alostor.play.minesend.fun.Play.minesend;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Furnace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;

public class Bake implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack ironNugget = new ItemStack(Material.IRON_ORE, 1); // Создаем предмет железного камня
            player.getInventory().addItem(ironNugget); // Добавляем железный камень в инвентарь игрока
            ItemStack enhancedFurnace = new ItemStack(Material.FURNACE, 1);
            ItemMeta meta = enhancedFurnace.getItemMeta();
            if (meta != null) {
                meta.setDisplayName(ChatColor.DARK_BLUE + "Enhanced Furnace");
                meta.setLore(Arrays.asList(ChatColor.GRAY + "Fast"));
                meta.addEnchant(Enchantment.DIG_SPEED, 10, true);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                enhancedFurnace.setItemMeta(meta);
                player.getInventory().addItem(enhancedFurnace);

            }
        } else {
            sender.sendMessage("This command can only be used in-game.");
        }
        return true;
    }
}
