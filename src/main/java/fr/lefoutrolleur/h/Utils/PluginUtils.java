package fr.lefoutrolleur.h.Utils;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class PluginUtils {

    static List<Material> entitySkull = new ArrayList<>();

    static {
        entitySkull.add(Material.SKELETON_SKULL);
        entitySkull.add(Material.ZOMBIE_HEAD);
        entitySkull.add(Material.CREEPER_HEAD);
    }



    /**
     * It returns the head of the entity passed in
     *
     * @param e The entity you want to get the head of.
     * @return An ItemStack
     */
    public static ItemStack getEntityHead(@NotNull Entity e){
        Material t = null;
        switch (e.getType()) {
            case ZOMBIE -> {
                t = Material.ZOMBIE_HEAD;
            }
            case SKELETON -> {
                t = Material.SKELETON_SKULL;
            }
            case CREEPER -> {
                t = Material.CREEPER_HEAD;
            }
        }
        if(t == null){
            return null;
        }
        return new ItemStack(t);
    }

    /**
     * It returns a list of all the entities that have a head
     *
     * @return A list of EntityType objects.
     */

    public static List<Material> getAllHead(){
        return entitySkull;
    }
}
