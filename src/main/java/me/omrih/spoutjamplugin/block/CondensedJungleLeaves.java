package me.omrih.spoutjamplugin.block;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCustomBlock;

import static me.omrih.spoutjamplugin.Main.blockPath;
import static me.omrih.spoutjamplugin.Main.plugin;

public class CondensedJungleLeaves extends GenericCustomBlock {
    public CondensedJungleLeaves() {
        // Plugin instance, Block ID, is opaque
        // GenericCubeBlockDesign takes Plugin instance, url to PNG texture, texture size
        super(plugin, "condensed_jungle_leaves", false, new GenericCubeBlockDesign(plugin, blockPath + "condensed_jungle_leaves.png", 16));
        setName("Condensed Jungle Leaves"); // Set block name
    }
}
