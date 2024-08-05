package bdmajora.backport.block.metastates;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.WorldSource;
import org.useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class GenericMetaStateInterpreter extends MetaStateInterpreter {
	@Override
	public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
		// Example: Generic handling based on metadata
		HashMap<String, String> result = new HashMap<>();

		// Assume lower two bits for horizontal rotation (similar to AnvilMetaState)
		int hRotation = meta & 0b11;
		result.put("facing", new String[]{"east", "west", "south", "north"}[hRotation]);

		// Additional metadata interpretation can be added here
		// Example: Use next two bits for another state, e.g., "variant"
		int variant = (meta >> 2) & 0b11;
		result.put("variant", new String[]{"type1", "type2", "type3", "type4"}[variant]);

		return result;
	}
}
