package bdmajora.backport.entity;

import com.mojang.nbt.CompoundTag;
import java.util.List;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.monster.EntityZombie;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;
import bdmajora.backport.item.ModItems;
import net.minecraft.core.enums.LightLayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.collection.NamespaceID;

public class EntityPiglinBrute extends EntityPiglin {

	public EntityPiglinBrute(World world) {
		super(world);
		this.textureIdentifier = new NamespaceID("minecraft", "piglin_brute");
		this.moveSpeed = 0.8F; // Brutes are faster than regular Piglins
		this.attackStrength = 10; // Brutes deal more damage
		this.scoreValue = 1000;
	}

	@Override
	public void tick() {
		this.moveSpeed = 1.0F; // Always in attack mode
		super.tick();
	}

	@Override
	protected Entity findPlayerToAttack() {
		// Brutes always attack players on sight
		EntityPlayer player = this.world.getClosestPlayerToEntity(this, 16.0D);
		return player != null && this.canEntityBeSeen(player) ? player : null;
	}

	@Override
	public boolean getCanSpawnHere() {
		int x = MathHelper.floor_double(this.x);
		int y = MathHelper.floor_double(this.y);
		int z = MathHelper.floor_double(this.z);
		int blockLight = this.world.getSavedLightValue(LightLayer.Block, x, y, z);
		return blockLight <= 7 && this.world.difficultySetting > 0 && super.getCanSpawnHere();
	}

	@Override
	public String getLivingSound() {
		return "mob.piglin_brute.pig";
	}

	@Override
	protected String getHurtSound() {
		return "mob.piglin_brute.hurt";
	}

	@Override
	protected String getDeathSound() {
		return "mob.piglin_brute.death";
	}

	// Custom texture for Piglin Brute
	@Override
	public String getEntityTexture() {
		return "/assets/backport/textures/entity/piglin/piglin_brute.png";
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/backport/textures/entity/piglin/piglin_brute.png";
	}
}
