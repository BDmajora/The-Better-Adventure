package bdmajora.backport.entity;

import bdmajora.backport.item.ModItems;
import com.mojang.nbt.CompoundTag;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityFlying;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.entity.projectile.EntityFireball;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;

import java.util.ArrayList;
import java.util.List;

public class EntityBlaze extends EntityFlying {
	private int attackCooldown = 0;
	private Entity targetedEntity = null;
	private int aggroCooldown = 0;

	// Define the fields for the Blaze's dimensions
	public float heightOffset = 0.0F;
	public float bbWidth = 0.6F;
	public float bbHeight = 1.825F;

	public EntityBlaze(World world) {
		super(world);
		this.textureIdentifier = new NamespaceID("minecraft", "blaze");
		this.setSize(bbWidth, bbHeight);
		this.fireImmune = true;
		this.scoreValue = 500;
	}

	@Override
	public void tick() {
		super.tick();

		// Blaze floating and targeting behavior
		if (this.targetedEntity != null && this.targetedEntity.removed) {
			this.targetedEntity = null;
		}

		if (this.targetedEntity == null || this.aggroCooldown-- <= 0) {
			this.targetedEntity = this.world.getClosestPlayerToEntity(this, 16.0);
			if (this.targetedEntity != null) {
				this.aggroCooldown = 20;
			}
		}

		// Attack behavior
		if (this.targetedEntity != null && this.attackCooldown-- <= 0) {
			if (this.canEntityBeSeen(this.targetedEntity)) {
				double dX = this.targetedEntity.x - this.x;
				double dY = this.targetedEntity.y + this.targetedEntity.heightOffset * 0.5F - (this.y + this.getBlazeEyeHeight());
				double dZ = this.targetedEntity.z - this.z;

				EntityFireball fireball = new EntityFireball(this.world, this, dX, dY, dZ);
				fireball.x = this.x;
				fireball.y = this.y + this.getBlazeEyeHeight();
				fireball.z = this.z;

				this.world.entityJoinedWorld(fireball);
				this.attackCooldown = 100; // Reset cooldown after attack
			}
		}

		// Spawn smoke particles around the Blaze entity
		for (int var1 = 0; var1 < 2; ++var1) {
			this.world.spawnParticle(
				"largesmoke",
				this.x + (this.random.nextDouble() - 0.5) * (double)this.bbWidth,
				this.y + this.random.nextDouble() * (double)this.bbHeight,
				this.z + (this.random.nextDouble() - 0.5) * (double)this.bbWidth,
				0.0, 0.0, 0.0, 0, 256 // Optional extra parameters
			);
		}
	}

	// Custom eye height method for the Blaze entity
	private float getBlazeEyeHeight() {
		return this.bbHeight * 0.5F; // Blaze eye height relative to bbHeight
	}

	@Override
	public boolean hurt(Entity attacker, int damage, DamageType type) {
		if (type == DamageType.FIRE) {
			return false; // Blaze is immune to fire
		} else {
			return super.hurt(attacker, damage, type);
		}
	}

	@Override
	public String getLivingSound() {
		return "mob.blaze.breathe";
	}

	@Override
	protected String getHurtSound() {
		return "mob.blaze.hit";
	}

	@Override
	protected String getDeathSound() {
		return "mob.blaze.death";
	}

	@Override
	protected List<WeightedRandomLootObject> getMobDrops() {
		List<WeightedRandomLootObject> drops = new ArrayList<>();
		drops.add(new WeightedRandomLootObject(ModItems.blazeRod.getDefaultStack(), 0, 1));
		return drops;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.world.difficultySetting > 0 && super.getCanSpawnHere();
	}

	@Override
	public void addAdditionalSaveData(CompoundTag tag) {
		super.addAdditionalSaveData(tag);
		tag.putShort("AttackCooldown", (short) this.attackCooldown);
	}

	@Override
	public void readAdditionalSaveData(CompoundTag tag) {
		super.readAdditionalSaveData(tag);
		this.attackCooldown = tag.getShort("AttackCooldown");
	}

	@Override
	public String getEntityTexture() {
		return "/assets/backport/textures/entity/blaze/blaze.png";
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/backport/textures/entity/blaze/blaze.png";
	}
}
