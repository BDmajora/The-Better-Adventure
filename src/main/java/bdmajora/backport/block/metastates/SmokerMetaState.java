package bdmajora.backport.block.metastates;

import net.minecraft.core.block.Block;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.world.WorldSource;
import useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class SmokerMetaState extends MetaStateInterpreter {
	@Override
	public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
		HashMap<String, String> results = new HashMap<>();
		Direction[] directions = new Direction[]{Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};
		boolean lit = (meta & 0b100) != 0;
		results.put("facing", String.valueOf(directions[meta & 0b011]).toLowerCase());
		results.put("lit", String.valueOf(lit));
		return results;
	}
}
