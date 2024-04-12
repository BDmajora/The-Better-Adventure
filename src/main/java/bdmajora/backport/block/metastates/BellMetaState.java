package bdmajora.backport.block.metastates;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.WorldSource;
import useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class BellMetaState extends MetaStateInterpreter {
	@Override
	public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
		int hRotation = meta & 0b11;
		int attachmentType = (meta & 0b1100) >> 2; // Shift right by 2 to get the third and fourth bits
		boolean hanging = (meta & 0b10000) == 0b10000; // Check the fifth bit to determine if the bell is hanging

		HashMap<String, String> result = new HashMap<>();
		result.put("facing", new String[]{"east", "west", "south", "north"}[hRotation]);
		result.put("hanging", hanging ? "true" : "false"); // Set the 'hanging' property of the block state
		result.put("attachment", new String[]{"floor", "ceiling", "single_wall", "double_wall"}[attachmentType]); // Set the 'attachment' property of the block state

		return result;
	}
}
