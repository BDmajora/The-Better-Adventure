package bdmajora.backport.entity;

import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.monster.EntitySkeleton;
import net.minecraft.core.entity.projectile.EntityArrow;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;
import com.mojang.nbt.CompoundTag;

public class EntityBogged extends EntitySkeleton {

	private static final ItemStack defaultHeldItem = new ItemStack(Item.toolBow, 1);  // Initial item

	public EntityBogged(World world) {
		super(world);
		// No need for manual entityData initialization in the constructor
	}

	// Handle the entity's tick update
	@Override
	public void tick() {
		super.tick();
		// Any additional tick logic for the entity
	}

	// Bow attack logic, similar to skeletons, explicitly included here
	@Override
	protected void attackEntity(Entity targetEntity, float distance) {
		if (distance < 10.0F) {
			double dX = targetEntity.x - this.x;
			double dZ = targetEntity.z - this.z;

			if (this.attackTime == 0) {
				if (!this.world.isClientSide) {
					EntityArrow arrow = new EntityArrow(this.world, this, false, 0);
					arrow.y += 1.0D;
					double dY = targetEntity.y + targetEntity.getHeadHeight() - 0.20000000298023224D - arrow.y;
					float arrowSpeed = MathHelper.sqrt_double(dX * dX + dZ * dZ) * 0.2F;

					// Firing the bow sound and projectile
					this.world.playSoundAtEntity(null, this, "random.bow", 1.0F, 1.0F / (this.random.nextFloat() * 0.4F + 0.8F));
					arrow.setHeading(dX, dY + arrowSpeed, dZ, 0.6F, 12.0F);
					this.world.entityJoinedWorld(arrow);
				}
				this.attackTime = 30;
			}

			this.yRot = (float) (Math.atan2(dZ, dX) * 180.0D / Math.PI) - 90.0F;
			this.hasAttacked = true;
		}
	}

	// Add texture methods for the entity
	@Override
	public String getEntityTexture() {
		return "/assets/backport/textures/entity/bogged/bogged.png"; // Change to your texture path
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/backport/textures/entity/bogged/bogged.png"; // Default texture path
	}

	// Add sound methods for the entity
	@Override
	public String getLivingSound() {
		return "backport.bogged.idle"; // Change to your sound path
	}

	@Override
	protected String getHurtSound() {
		return "backport.bogged.hurt"; // Change to your hurt sound path
	}

	@Override
	protected String getDeathSound() {
		return "backport.bogged.death"; // Change to your death sound path
	}
}
