package me.omrih.releafed.tool;

import org.getspout.spoutapi.material.item.GenericCustomTool;

import static me.omrih.releafed.Main.itemPath;
import static me.omrih.releafed.Main.plugin;

public class CondensedLeavesPickaxe extends GenericCustomTool {
    public CondensedLeavesPickaxe() {
        super(plugin, "condensed_leaves_pickaxe", itemPath + "condensed_leaves_pickaxe.png");
        setName("Condensed Leaves Pickaxe");
    }
}
