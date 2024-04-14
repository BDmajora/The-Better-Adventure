package bdmajora.backport.block.metastates;

import bdmajora.backport.block.dragonfly.BlockGlassPane;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.WorldSource;
import useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class GlassPaneMetaState extends MetaStateInterpreter {
	@Override
	public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
		HashMap<String, String> map = new HashMap<>();
		map.put("north", ((BlockGlassPane)block).canConnectTo(worldSource, x, y, z - 1) ? "true" : "false");
		map.put("south", ((BlockGlassPane)block).canConnectTo(worldSource, x, y, z + 1) ? "true" : "false");
		map.put("west", ((BlockGlassPane)block).canConnectTo(worldSource, x - 1, y, z) ? "true" : "false");
		map.put("east", ((BlockGlassPane)block).canConnectTo(worldSource, x + 1, y, z) ? "true" : "false");
		return map;
	}
}
