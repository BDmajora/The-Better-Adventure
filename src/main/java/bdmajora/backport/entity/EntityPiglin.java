package bdmajora.backport.entity;

import com.mojang.nbt.CompoundTag;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.monster.EntityZombie;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.LightLayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;
import bdmajora.backport.item.ModItems;

public class EntityPiglin extends EntityZombie {
	private int angerLevel = 0;
	private int randomSoundDelay = 0;
	private static final ItemStack defaultHeldItem;

	public EntityPiglin(World world) {
		super(world);
		this.textureIdentifier = new NamespaceID("minecraft", "piglin");
		this.moveSpeed = 0.6F; // Piglins are generally faster than Pig Zombies
		this.attackStrength = 7; // Piglins deal more damage than Pig Zombies
		this.fireImmune = false; // Piglins are not fire immune
		this.scoreValue = 500;
	}

	public void tick() {
		this.moveSpeed = this.entityToAttack == null ? 0.6F : 1.0F; // Faster attack mode
		if (this.randomSoundDelay > 0 && --this.randomSoundDelay == 0) {
			this.world.playSoundAtEntity((Entity) null, this, "mob.piglin.angry", this.getSoundVolume() * 2.0F, ((this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F) * 1.8F);
		}

		super.tick();
	}

	public boolean getCanSpawnHere() {
		int x = MathHelper.floor_double(this.x);
		int y = MathHelper.floor_double(this.y);
		int z = MathHelper.floor_double(this.z);
		if (this.world.getBlockId(x, y, z) != 0) {
			return false;
		} else {
			int blockLight = this.world.getSavedLightValue(LightLayer.Block, x, y, z);
			if (blockLight > 7) {
				return false;
			} else {
				return this.world.difficultySetting > 0 && this.world.checkIfAABBIsClear(this.bb) && this.world.getCubes(this, this.bb).size() == 0 && !this.world.getIsAnyLiquid(this.bb);
			}
		}
	}

	public void addAdditionalSaveData(CompoundTag tag) {
		super.addAdditionalSaveData(tag);
		tag.putShort("Anger", (short) this.angerLevel);
	}

	public void readAdditionalSaveData(CompoundTag tag) {
		super.readAdditionalSaveData(tag);
		this.angerLevel = tag.getShort("Anger");
	}

	protected Entity findPlayerToAttack() {
		return this.angerLevel == 0 ? null : super.findPlayerToAttack();
	}

	public boolean hurt(Entity attacker, int i, DamageType type) {
		if (type == DamageType.FIRE) {
			return false;
		} else {
			if (attacker instanceof EntityPlayer) {
				List<Entity> list = this.world.getEntitiesWithinAABBExcludingEntity(this, this.bb.expand(32.0, 32.0, 32.0));

				for (Entity entity : list) {
					if (entity instanceof EntityPiglin) {
						EntityPiglin entityPiglin = (EntityPiglin) entity;
						entityPiglin.becomeAngryAt(attacker);
					}
				}

				this.becomeAngryAt(attacker);
			}

			return super.hurt(attacker, i, type);
		}
	}

	private void becomeAngryAt(Entity entity) {
		this.entityToAttack = entity;
		this.angerLevel = 400 + this.random.nextInt(400);
		this.randomSoundDelay = this.random.nextInt(40);
	}

	public String getLivingSound() {
		return "mob.piglin.pig";
	}

	protected String getHurtSound() {
		return "mob.piglin.hurt";
	}

	protected String getDeathSound() {
		return "mob.piglin.death";
	}

	protected List<WeightedRandomLootObject> getMobDrops() {
		List<WeightedRandomLootObject> drops = new ArrayList<>();
		float drop = this.world.rand.nextFloat();
		if (!(drop < 0.5F)) {
			if (drop < 0.95F) {
				drops.add(new WeightedRandomLootObject(ModItems.goldNugget.getDefaultStack(), 0, 1));
			} else if (drop < 0.99F) {
				drops.add(new WeightedRandomLootObject(Item.oreRawGold.getDefaultStack(), 0, 1));
			} else {
				drops.add(new WeightedRandomLootObject(Item.toolSwordGold.getDefaultStack(), 0, 1));
			}
		}

		return drops;
	}

	public ItemStack getHeldItem() {
		return defaultHeldItem;
	}

	// Adding custom texture methods
	@Override
	public String getEntityTexture() {
		return "/assets/backport/textures/entity/piglin/piglin.png";
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/backport/textures/entity/piglin/piglin.png";
	}

	static {
		defaultHeldItem = new ItemStack(Item.toolSwordGold, 1); // Piglins often hold gold weapons
	}
}
