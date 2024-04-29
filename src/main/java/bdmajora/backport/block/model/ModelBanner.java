package bdmajora.backport.block.model;


import net.minecraft.client.render.model.Cube;

public class ModelBanner {
	public Cube BannerPole = new Cube(0, 0, 64, 48);
	public Cube BannerPoleShort;
	public Cube Banner;
	public Cube BannerOverlay;
	public Cube BannerBase;

	public ModelBanner() {
		this.BannerPole.addBox(-1.0F, -22.0F, -1.0F, 2, 33, 2, 0.0F);
		this.BannerPoleShort = new Cube(0, 0, 64, 48);
		this.BannerPoleShort.addBox(-1.0F, -22.0F, -1.0F, 2, 16, 2, 0.0F);
		this.Banner = new Cube(8, 0, 64, 48);
		this.Banner.addBox(1.0F, -21.0F, -0.0F, 24, 16, 0, 0.0F);
		this.BannerOverlay = new Cube(0, 0, 24, 16);
		this.BannerOverlay.addBox(1.0F, -21.0F, -0.0F, 24, 16, 0, 0.0F);
		this.BannerBase = new Cube(0, 40, 64, 48);
		this.BannerBase.addBox(-2.0F, 11.0F, -2.0F, 4, 1, 4, 0.0F);
	}

	public void renderPole() {
		this.BannerPole.render(0.0625F);
	}

	public void renderPoleShort() {
		this.BannerPoleShort.render(0.0625F);
	}

	public void renderBase() {
		this.BannerBase.render(0.0625F);
	}

	public void renderBanner() {
		this.Banner.render(0.0625F);
	}

	public void renderBannerOverlay() {
		this.BannerOverlay.render(0.0625F);
	}
}
