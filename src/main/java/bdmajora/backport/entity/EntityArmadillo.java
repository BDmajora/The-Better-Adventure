package bdmajora.backport.entity;

import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.world.World;

public class EntityArmadillo extends EntityAnimal {
	private boolean isRolledUp = false;

	public EntityArmadillo(World world) {
		super(world);
	}

	@Override
	public void tick() {
		super.tick();

		// Custom logic for the Armadillo's rolling behavior
		if (this.isRolledUp) {
			this.moveSpeed = 0.0f;
		} else {
			this.moveSpeed = 1.2f;
		}
	}

	// Getter for rolled-up state
	public boolean isRolledUp() {
		return this.isRolledUp;
	}

	// Setter for rolled-up state
	public void setRolledUp(boolean rolledUp) {
		this.isRolledUp = rolledUp;
	}

	@Override
	public String getEntityTexture() {
		return "/assets/backport/textures/entity/armadillo/armadillo.png";
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/backport/textures/entity/armadillo/armadillo.png";
	}
}
