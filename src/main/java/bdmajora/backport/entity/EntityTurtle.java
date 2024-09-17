package bdmajora.backport.entity;

import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.animal.EntityWaterAnimal;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pathfinder.Path;

public class EntityTurtle extends EntityWaterAnimal {
	private boolean isTamed = false;
	private String turtleOwner = "";

	public EntityTurtle(World world) {
		super(world);
		this.textureIdentifier = new NamespaceID("backport", "turtle");
		this.setSize(0.9f, 0.6f);
		this.moveSpeed = 1.0f;
		this.scoreValue = 100;
	}

	@Override
	public void init() {
		super.init();
		this.entityData.define(15, ItemStack.NO_ITEM);
		this.entityData.define(16, (byte)0);
		this.entityData.define(17, "");
	}

	@Override
	public String getLivingSound() {
		return "backport.turtleidle";
	}

	@Override
	public String getHurtSound() {
		return "backport.turtlehurt";
	}

	@Override
	public String getDeathSound() {
		return "backport.turtledeath";
	}

	@Override
	public float getSoundVolume() {
		return 0.8f;
	}


	@Override
	public ItemStack getHeldItem() {
		return this.entityData.getItemStack(15);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	public String getEntityTexture() {
		return "/assets/backport/textures/entity/turtle/big_sea_turtle.png";
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/backport/textures/entity/turtle/big_sea_turtle.png";
	}


}
