package me.waiaf.minceraft;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ItemManager {

    public static HashMap<Integer, ItemStack> ItemIDs = new HashMap<>();
    public static ItemStack MocPhongLon;

    public static void init(){

        createMocPhongLon();

    }

    private static void createMocPhongLon(){

        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.of("#F5FEFD") + "Móc Phóng Lợn");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "Gấp đôi damage khi đang cưởi ngựa");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.setCustomModelData(1);
        item.setItemMeta(meta);
        MocPhongLon = item;
        ItemIDs.put(1, MocPhongLon);

    }

}
