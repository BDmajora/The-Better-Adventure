package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityFrog;
import net.minecraft.client.render.entity.LivingRenderer;
import org.useless.dragonfly.model.entity.BenchEntityModel;

public class FrogRenderer extends LivingRenderer<EntityFrog> {
	public FrogRenderer(BenchEntityModel orCreateEntityModel, float v) {
		super(orCreateEntityModel, v);
	}
}
