package bdmajora.backport.entity;

import com.mojang.nbt.CompoundTag;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.entity.animal.IAnimal;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;

import static bdmajora.backport.backport.MOD_ID;

public class EntityBat extends EntityAnimal implements IAnimal {
	public float wingRotation = 0.0f;
	public float wingDestPos = 0.0f;
	public float wingSpeed;
	public float prevWingRotation;
	public float wingSwing = 1.0f;

	public EntityBat(World world) {
		super(world);
		this.textureIdentifier = new NamespaceID(MOD_ID, "bat");
		this.setSize(0.5F, 0.9F);
		this.mobDrops.add(new WeightedRandomLootObject(Item.leather.getDefaultStack(), 1, 2));
	}

	@Override
	public boolean interact(EntityPlayer entityplayer) {
		ItemStack itemstack = entityplayer.inventory.getCurrentItem();
		if (itemstack != null && itemstack.itemID == Item.foodCookie.id) {
			itemstack.consumeItem(entityplayer);
			this.heal(2); // Bats heal with apples
			return true;
		}
		return super.interact(entityplayer);
	}

	@Override
	protected boolean makeStepSound() {
		return false;
	}

	@Override
	public int getMaxHealth() {
		return 6;
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
				int i = this.world.getBlockId(MathHelper.floor_double(this.x), MathHelper.floor_double(this.bb.minY) - 1, MathHelper.floor_double(this.z));
				if (i > 0) {
					friction = Block.blocksList[i].movementScale * 0.91f;
				}
			}
			float movementFactor = 0.1627714f / (friction * friction * friction);
			this.moveRelative(moveStrafing, moveForward, this.onGround ? 0.1f * movementFactor : 0.02f);
			friction = 0.91f;
			if (this.onGround) {
				friction = 0.5460001f;
				int j = this.world.getBlockId(MathHelper.floor_double(this.x), MathHelper.floor_double(this.bb.minY) - 1, MathHelper.floor_double(this.z));
				if (j > 0) {
					friction = Block.blocksList[j].movementScale * 0.91f;
				}
			}
			this.move(this.xd, this.yd, this.zd);
			this.xd *= friction;
			this.yd *= friction;
			this.zd *= friction;
		}
		this.prevLimbYaw = this.limbYaw;
		double d = this.x - this.xo;
		double d1 = this.z - this.zo;
		float f4 = MathHelper.sqrt_double(d * d + d1 * d1) * 4.0f;
		if (f4 > 1.0f) {
			f4 = 1.0f;
		}
		this.limbYaw += (f4 - this.limbYaw) * 0.4f;
		this.limbSwing += this.limbYaw;
	}

	@Override
	public boolean canClimb() {
		return false; // Bats can't climb
	}

	public boolean getCanSpawnHere() {
		int x = MathHelper.floor_double(this.x);
		int y = MathHelper.floor_double(this.bb.minY) - 1;
		int z = MathHelper.floor_double(this.z);
		int id = this.world.getBlockId(x, y, z);
		if (Block.blocksList[id] != null) {
			return Block.blocksList[id].hasTag(BlockTags.PASSIVE_MOBS_SPAWN) && this.world.getFullBlockLightValue(x, y, z) > 8 && super.getCanSpawnHere();
		}
		return false;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.prevWingRotation = this.wingRotation;
		this.wingSpeed = this.wingDestPos;
		this.wingDestPos = (float)((double)this.wingDestPos + (double)(this.onGround ? -1 : 4) * 0.3);
		if (this.wingDestPos < 0.0f) {
			this.wingDestPos = 0.0f;
		}
		if (this.wingDestPos > 1.0f) {
			this.wingDestPos = 1.0f;
		}
		if (!this.onGround && this.wingSwing < 1.0f) {
			this.wingSwing = 1.0f;
		}
		this.wingSwing = (float)((double)this.wingSwing * 0.9);
		if (!this.onGround && this.yd < 0.0) {
			this.yd *= 0.6;
		}
		this.wingRotation += this.wingSwing * 2.0f;
	}

	@Override
	public void causeFallDamage(float f) {
		// Bats don't take fall damage
	}

	@Override
	public void addAdditionalSaveData(CompoundTag tag) {
		super.addAdditionalSaveData(tag);
	}

	@Override
	public void readAdditionalSaveData(CompoundTag tag) {
		super.readAdditionalSaveData(tag);
	}

	@Override
	public String getLivingSound() {
		return "backport.batidle";
	}

	@Override
	public String getHurtSound() {
		return "backport.bathurt";
	}

	@Override
	public String getDeathSound() {
		return "backport.batdeath";
	}

	@Override
	public String getEntityTexture() {
		return "/assets/backport/textures/entity/bat/bat.png";
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/backport/textures/entity/bat/bat.png";
	}
}
