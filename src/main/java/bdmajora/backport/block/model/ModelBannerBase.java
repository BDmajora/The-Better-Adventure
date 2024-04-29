package bdmajora.backport.block.model;

import net.minecraft.client.render.model.Cube;

public class ModelBannerBase {
	public Cube BannerBase = new Cube(0, 0);

	public ModelBannerBase() {
		this.BannerBase.addBox(-2.0F, 10.0F, -2.0F, 4, 2, 4, 0.0F);
	}

	public void render() {
		this.BannerBase.render(0.0625F);
	}
}
