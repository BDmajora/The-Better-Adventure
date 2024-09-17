package bdmajora.backport.entity;

import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;

public class EntityArmadillo extends EntityAnimal {
	private boolean isRolledUp = false; // Armadillo-specific behavior
	private String armadilloOwner = ""; // Optional ownership mechanic, similar to the turtle

	public EntityArmadillo(World world) {
		super(world);
		this.textureIdentifier = new NamespaceID("backport", "armadillo");
		this.setSize(0.7f, 0.5f); // Smaller size compared to a turtle
		this.moveSpeed = 1.2f; // Adjust speed as desired
		this.scoreValue = 50; // Lower score value than a turtle
	}

	@Override
	public void init() {
		super.init();
		this.entityData.define(15, ItemStack.NO_ITEM); // Reserved for potential held item
		this.entityData.define(16, (byte) 0); // For rolling up state or other states
		this.entityData.define(17, ""); // Owner name or any other custom data
	}

	@Override
	public String getLivingSound() {
		return "backport.armadillo_idle"; // Armadillo idle sound
	}

	@Override
	public String getHurtSound() {
		return "backport.armadillo_hurt"; // Armadillo hurt sound
	}

	@Override
	public String getDeathSound() {
		return "backport.armadillo_death"; // Armadillo death sound
	}

	@Override
	public float getSoundVolume() {
		return 0.6f; // Armadillo sounds are quieter
	}

	@Override
	public ItemStack getHeldItem() {
		return this.entityData.getItemStack(15); // Holds an item if defined
	}

	@Override
	public void tick() {
		super.tick();

		// Custom logic for the Armadillo's rolling behavior
		if (this.isRolledUp) {
			this.moveSpeed = 0.0f; // Prevent movement when rolled up
		} else {
			this.moveSpeed = 1.2f; // Restore speed when not rolled up
		}
	}

	public void setRolledUp(boolean rolledUp) {
		this.isRolledUp = rolledUp;
		// Optionally, trigger an animation or sound effect when rolling up
//		if (rolledUp) {
//			this.world.playSound(this, "backport.armadillo_rollup", 1.0f, 1.0f);
//		} else {
//			this.world.playSound(this, "backport.armadillo_unroll", 1.0f, 1.0f);
//		}
	}

	@Override
	public String getEntityTexture() {
		return "/assets/backport/textures/entity/armadillo/armadillo.png"; // Path to armadillo texture
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/backport/textures/entity/armadillo/armadillo.png"; // Default texture
	}
}
