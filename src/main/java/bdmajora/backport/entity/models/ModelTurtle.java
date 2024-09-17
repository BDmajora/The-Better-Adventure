package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class ModelTurtle extends ModelBase {

	public Cube body;
	public Cube eggbelly;
	public Cube head;
	public Cube leg0;
	public Cube leg1;
	public Cube leg2;
	public Cube leg3;

	public ModelTurtle() {
		// Define body
		this.body = new Cube(7, 37, 128, 64);
		this.body.addBox(-9.5F, 3.0F, -10.0F, 19, 20, 6);
		this.body.setRotationPoint(0.0F, 11.0F, -10.0F);

		// Rotate the body 90 degrees around the X-axis
		this.body.rotateAngleX = (float) Math.toRadians(90.0F);

		// Define eggbelly
		this.eggbelly = new Cube(70, 33, 128, 64);
		this.eggbelly.addBox(-4.5F, 3.0F, -14.0F, 9, 18, 1);
		this.eggbelly.setRotationPoint(0.0F, 8.0F, -10.0F);

		this.eggbelly.rotateAngleX = (float) Math.toRadians(90.0F);

		// Define head
		this.head = new Cube(3, 0, 128, 64);
		this.head.addBox(-3.0F, -1.0F, -3.0F, 6, 5, 6);
		this.head.setRotationPoint(0.0F, 19.0F, -10.0F);

		// Define legs
		this.leg0 = new Cube(1, 23, 128, 64);
		this.leg0.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 10);
		this.leg0.setRotationPoint(-3.5F, 22.0F, 11.0F);

		this.leg1 = new Cube(1, 12, 128, 64);
		this.leg1.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 10);
		this.leg1.setRotationPoint(3.5F, 22.0F, 11.0F);

		this.leg2 = new Cube(27, 30, 128, 64);
		this.leg2.addBox(-13.0F, 0.0F, -2.0F, 13, 1, 5);
		this.leg2.setRotationPoint(-5.0F, 21.0F, -5.0F);

		this.leg3 = new Cube(27, 24, 128, 64);
		this.leg3.addBox(0.0F, 0.0F, -2.0F, 13, 1, 5);
		this.leg3.setRotationPoint(5.0F, 21.0F, -5.0F);
	}

	@Override
	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);
		this.body.render(scale);
		this.eggbelly.render(scale);
		this.head.render(scale);
		this.leg0.render(scale);
		this.leg1.render(scale);
		this.leg2.render(scale);
		this.leg3.render(scale);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.head.rotateAngleX = headPitch / 57.29578F;
		this.head.rotateAngleY = headYaw / 57.29578F;

		this.leg0.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbYaw;
		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.141593F) * 1.4F * limbYaw;
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbYaw;
		this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.141593F) * 1.4F * limbYaw;
	}
}
