package bdmajora.backport.block.metastates;

import net.minecraft.core.block.Block;
import net.minecraft.core.util.helper.Axis;
import net.minecraft.core.world.WorldSource;
import org.useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class ChainMetaState extends MetaStateInterpreter {
	@Override
	public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
		HashMap<String, String> results = new HashMap<>();
		Axis[] axies = new Axis[]{Axis.X, Axis.Y, Axis.Z, Axis.NONE};
		results.put("axis", String.valueOf(axies[meta & 0b11]).toLowerCase());
		return results;
	}
}
