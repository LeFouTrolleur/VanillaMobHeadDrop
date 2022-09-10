package fr.lefoutrolleur.h;

import fr.lefoutrolleur.h.Events.EntityDeath;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class VanillaHeadPlugin extends JavaPlugin {

    PluginManager pm = Bukkit.getPluginManager();
    @Override
    public void onEnable() {
        getLogger().fine("Head Drop Plugin Enable!");
        super.onEnable();
        pm.registerEvents(new EntityDeath(), this);
    }

    @Override
    public void onDisable() {
        getLogger().fine("Head Drop Plugin now Disable!");
        super.onDisable();
    }
}
