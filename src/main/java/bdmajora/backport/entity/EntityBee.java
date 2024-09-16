package bdmajora.backport.entity;

import com.mojang.nbt.CompoundTag;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.entity.animal.IAnimal;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;

import static bdmajora.backport.backport.MOD_ID;

public class EntityBee extends EntityAnimal implements IAnimal {

	public float wingPosition;      // Current wing position
	public float prevWingPosition;  // Previous wing position
	public float destPos;           // Target wing position
	public float prevDestPos;       // Previous target wing position
	public int stingTime;           // Time since last sting
	public boolean hasStung;        // Flag if bee has stung

	public EntityBee(World world) {
		super(world);
		this.textureIdentifier = new NamespaceID(MOD_ID, "bee");
		this.setSize(0.5F, 0.5F);  // Bee size
		this.hasStung = false;     // Initially, the bee hasn't stung
		this.stingTime = 0;        // Reset sting timer
	}

	@Override
	public boolean interact(EntityPlayer player) {
		ItemStack itemstack = player.inventory.getCurrentItem();
		// Example interaction where bee gets agitated if player holds a flower
		if (itemstack != null && itemstack.getItem() == Item.wheat) {
			this.setTarget(player);  // Bee will follow or attack the player
			return true;
		}
		return super.interact(player);
	}

	@Override
	public void moveEntityWithHeading(float moveStrafing, float moveForward) {
		if (this.isInWater()) {
			this.moveRelative(moveStrafing, moveForward, 0.02f);
			this.move(this.xd, this.yd, this.zd);
			this.xd *= 0.8;
			this.yd *= 0.8;
			this.zd *= 0.8;
		} else if (this.isInLava()) {
			this.moveRelative(moveStrafing, moveForward, 0.02f);
			this.move(this.xd, this.yd, this.zd);
			this.xd *= 0.5;
			this.yd *= 0.5;
			this.zd *= 0.5;
		} else {
			float friction = 0.91f;
			if (this.onGround) {
				friction = 0.5460001f;
				int blockId = this.world.getBlockId(MathHelper.floor_double(this.x), MathHelper.floor_double(this.bb.minY) - 1, MathHelper.floor_double(this.z));
				if (blockId > 0) {
					friction = Block.blocksList[blockId].movementScale * 0.91f;
				}
			}
			float acceleration = 0.1627714f / (friction * friction * friction);
			this.moveRelative(moveStrafing, moveForward, this.onGround ? 0.1f * acceleration : 0.02f);
			this.move(this.xd, this.yd, this.zd);
			this.xd *= friction;
			this.yd *= friction;
			this.zd *= friction;
		}
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.prevWingPosition = this.wingPosition;
		this.prevDestPos = this.destPos;

		// Bee wing movement animation
		this.destPos = (float)((double)this.destPos + (double)(this.onGround ? -1 : 4) * 0.3);
		if (this.destPos < 0.0f) {
			this.destPos = 0.0f;
		}
		if (this.destPos > 1.0f) {
			this.destPos = 1.0f;
		}
		if (!this.onGround && this.yd < 0.0) {
			this.yd *= 0.6;
		}

		// Update wing position
		this.wingPosition += this.destPos * 2.0F;

		// Sting behavior
		if (this.hasStung) {
			this.stingTime++;
			if (this.stingTime > 20) {
				this.damageEntity(2, DamageType.COMBAT);  // Bee takes damage after stinging
				this.hasStung = false;
				this.stingTime = 0;
			}
		}
	}

	@Override
	public boolean canClimb() {
		return false;
	}

	@Override
	public void causeFallDamage(float distance) {
		// Bees don't take fall damage
	}

	@Override
	public void addAdditionalSaveData(CompoundTag tag) {
		super.addAdditionalSaveData(tag);
		tag.putBoolean("HasStung", this.hasStung);
		tag.putInt("StingTime", this.stingTime);
	}

	@Override
	public void readAdditionalSaveData(CompoundTag tag) {
		super.readAdditionalSaveData(tag);
		this.hasStung = tag.getBoolean("HasStung");
		this.stingTime = tag.getInteger("StingTime");
	}

	@Override
	public String getLivingSound() {
		return "backport.beeidle";
	}

	@Override
	public String getHurtSound() {
		return "backport.beehurt";
	}

	@Override
	public String getDeathSound() {
		return "backport.beedeath";
	}

	public boolean canAttack() {
		return !this.hasStung;
	}

	@Override
	public boolean getCanSpawnHere() {
		// Custom logic to determine if the bee can spawn
		int x = MathHelper.floor_double(this.x);
		int y = MathHelper.floor_double(this.bb.minY) - 1;
		int z = MathHelper.floor_double(this.z);
		int blockId = this.world.getBlockId(x, y, z);

		return this.world.getFullBlockLightValue(x, y, z) > 8 && Block.blocksList[blockId] != null && super.getCanSpawnHere();
	}

	@Override
	public String getEntityTexture() {
		return "/assets/backport/textures/entity/bee/bee.png";
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/backport/textures/entity/bee/bee.png";
	}
}
