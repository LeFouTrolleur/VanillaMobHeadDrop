package fr.lefoutrolleur.h.Events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import static fr.lefoutrolleur.h.Utils.PluginUtils.*;


public class EntityDeath implements Listener {

    @EventHandler
    void EntityDeathEvent(EntityDeathEvent e){
        if(!e.getDrops().contains(getEntityHead(e.getEntity()))){
            e.getDrops().add(getEntityHead(e.getEntity()));
        }
    }
}
