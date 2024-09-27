package bdmajora.backport.entity;

import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.world.World;

public class EntityPolarBear extends EntityAnimal {
	private boolean isAggressive = false;

	public EntityPolarBear(World world) {
		super(world);
	}

	@Override
	public void tick() {
		super.tick();

		// Custom logic for the Polar Bear's aggressive behavior
		if (this.isAggressive) {
			// Increase move speed or implement other aggressive behavior
			this.moveSpeed = 1.5f;  // Example speed for aggressive behavior
		} else {
			this.moveSpeed = 1.0f;  // Default speed
		}
	}

	// Getter for aggressive state
	public boolean isAggressive() {
		return this.isAggressive;
	}

	// Setter for aggressive state
	public void setAggressive(boolean aggressive) {
		this.isAggressive = aggressive;
	}

	@Override
	public String getEntityTexture() {
		return "/assets/backport/textures/entity/bear/polarbear.png";  // Adjust the path as needed
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/backport/textures/entity/bear/polarbear.png";  // Adjust the path as needed
	}


}
