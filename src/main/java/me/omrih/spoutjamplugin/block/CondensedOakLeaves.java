package me.omrih.spoutjamplugin.block;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCustomBlock;

import static me.omrih.spoutjamplugin.Main.blockPath;
import static me.omrih.spoutjamplugin.Main.plugin;

public class CondensedOakLeaves extends GenericCustomBlock {
    public CondensedOakLeaves() {
        // Plugin instance, Block ID, is opaque
        // GenericCubeBlockDesign takes Plugin instance, url to PNG texture, texture size
        super(plugin, "condensed_oak_leaves", false, new GenericCubeBlockDesign(plugin, blockPath + "condensed_oak_leaves.png", 16));
        setName("Condensed Oak Leaves"); // Set block name
    }
}
