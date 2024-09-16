package bdmajora.backport.entity;

import com.mojang.nbt.CompoundTag;
import java.util.List;

import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.monster.EntityZombie;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.enums.LightLayer;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;
import bdmajora.backport.item.ModItems;
import net.minecraft.core.item.Item;

public class EntityZombifiedPiglin extends EntityZombie {
	private boolean provoked = false;
	private static final ItemStack defaultHeldItem;

	public EntityZombifiedPiglin(World world) {
		super(world);
		this.textureIdentifier = new NamespaceID("minecraft", "zombified_piglin");
		this.moveSpeed = 2.28F; // Normal idle speed
		this.attackStrength = 5; // Normal attack strength
		this.fireImmune = true; // Immune to fire and lava
		this.scoreValue = 300;
	}

	@Override
	public void tick() {
		if (this.provoked) {
			this.moveSpeed = 3.38F; // Faster when provoked
		}
		super.tick();
	}

	@Override
	public boolean hurt(Entity attacker, int damage, DamageType type) {
		if (!this.provoked) {
			this.provoked = true; // Provoked when attacked
		}
		return super.hurt(attacker, damage, type);
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
		return "mob.zombified_piglin.idle";
	}

	@Override
	protected String getHurtSound() {
		return "mob.zombified_piglin.hurt";
	}

	@Override
	protected String getDeathSound() {
		return "mob.zombified_piglin.death";
	}

	// Behavior to destroy turtle eggs
	public void destroyTurtleEggs() {
		// Add turtle egg destruction logic
	}

	@Override
	protected List<WeightedRandomLootObject> getMobDrops() {
		List<WeightedRandomLootObject> drops = super.getMobDrops();
		// Custom loot logic for armor and gold weapons
		float dropChance = this.world.rand.nextFloat();
		if (dropChance < 0.55F) {
			drops.add(new WeightedRandomLootObject(ModItems.goldNugget.getDefaultStack(), 0, 1));
		} else if (dropChance < 0.95F) {
			drops.add(new WeightedRandomLootObject(Item.toolSwordGold.getDefaultStack(), 0, 1));
		} else {
			drops.add(new WeightedRandomLootObject(Item.armorHelmetGold.getDefaultStack(), 0, 1));
		}
		return drops;
	}

	@Override
	public ItemStack getHeldItem() {
		return defaultHeldItem;
	}

	@Override
	public String getEntityTexture() {
		return "/assets/backport/textures/entity/piglin/zombified_piglin.png";
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/backport/textures/entity/piglin/zombified_piglin.png";
	}

	static {
		defaultHeldItem = new ItemStack(Item.toolSwordGold, 1); // Default held item is a golden sword
	}
}
