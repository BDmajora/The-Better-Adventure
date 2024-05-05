package bdmajora.backport.block.entity;

import bdmajora.backport.block.ModBlocks;
import com.mojang.nbt.CompoundTag;
import net.minecraft.core.block.entity.TileEntity;

public class TileEntityBell extends TileEntity {
	private int ringingTicks = 0;
	private boolean isRinging = false;
	private int ringFacing = 0; // Use an integer to store the facing direction

	// NBT keys
	private static final String RINGING_TICKS_KEY = "RingingTicks";
	private static final String IS_RINGING_KEY = "IsRinging";
	private static final String RING_FACING_KEY = "RingFacing";

	@Override
	public void tick() {
		if (isRinging) {
			++ringingTicks;
		}

		if (ringingTicks >= 50) {
			isRinging = false;
			ringingTicks = 0;
		}
	}

	public void ring(int facing) { // Take an integer parameter for the facing direction
		ringFacing = facing;
		if (isRinging) {
			ringingTicks = 0;
		} else {
			isRinging = true;
		}
		// Schedule your block event here
	}


	public int getRingingTicks() {
		return isRinging ? ringingTicks : 0;
	}

	public boolean isRinging() {
		return isRinging;
	}

	public int getRingFacing() {
		return isRinging ? ringFacing : 0;
	}

	@Override
	public void readFromNBT(CompoundTag tagCompound) {
		super.readFromNBT(tagCompound);
		ringingTicks = tagCompound.getInteger(RINGING_TICKS_KEY);
		isRinging = tagCompound.getBoolean(IS_RINGING_KEY);
		ringFacing = tagCompound.getInteger(RING_FACING_KEY);
	}

	@Override
	public void writeToNBT(CompoundTag tagCompound) {
		super.writeToNBT(tagCompound);
		tagCompound.putInt(RINGING_TICKS_KEY, ringingTicks);
		tagCompound.putBoolean(IS_RINGING_KEY, isRinging);
		tagCompound.putInt(RING_FACING_KEY, ringFacing);
	}
}
