package bdmajora.backport.block.metastates;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.WorldSource;
import useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class LanternMetaState extends MetaStateInterpreter {
	@Override
	public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
		boolean hanging = (meta & 0b1) == 0b1; // Check the least significant bit to determine if the lantern is hanging
		HashMap<String, String> result = new HashMap<>();
		result.put("hanging", hanging ? "true" : "false"); // Set the 'hanging' property of the block state
		return result;
	}
}
