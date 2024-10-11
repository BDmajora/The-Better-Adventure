package bdmajora.backport.entity;

import net.minecraft.core.entity.monster.EntitySkeleton;
import net.minecraft.core.world.World;

public class EntityBogged extends EntitySkeleton {
	public EntityBogged(World world) {
		super(world);
	}

	@Override
	public String getEntityTexture() {
		return "/assets/backport/textures/entity/bogged/bogged.png";
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/backport/textures/entity/bogged/bogged.png";
	}

	@Override
	public String getLivingSound() {
		return "backport.bogged.bogged_idle";
	}

	@Override
	protected String getHurtSound() {
		return "backport.bogged_hurt";
	}

	@Override
	protected String getDeathSound() {
		return "backport.bogged_death";
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void updatePlayerActionState() {
		super.updatePlayerActionState();
	}
}
