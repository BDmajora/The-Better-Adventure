package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class ModelWarden extends ModelBase {

	public Cube body;
	public Cube rightRibcage;
	public Cube leftRibcage;
	public Cube head;
	public Cube rightTendril;
	public Cube leftTendril;
	public Cube rightArm;
	public Cube leftArm;
	public Cube rightLeg;
	public Cube leftLeg;

	public ModelWarden() {
		// Define body with 128x128 texture
		this.body = new Cube(0, 0, 128, 128);
		this.body.addBox(-9.0F, -13.0F, -4.0F, 18, 21, 11);
		this.body.setRotationPoint(0.0F, 3.0F, 0.0F);

		// Define right ribcage with 128x128 texture
		this.rightRibcage = new Cube(90, 11, 128, 128);
		this.rightRibcage.addBox(-2.0F, -11.0F, -0.1F, 9, 21, 0);
		this.rightRibcage.setRotationPoint(-7.0F, 3.0F, -4.0F);

		// Define left ribcage with 128x128 texture
		this.leftRibcage = new Cube(90, 11, 128, 128);
		this.leftRibcage.mirror = true;
		this.leftRibcage.addBox(-7.0F, -11.0F, -0.1F, 9, 21, 0);
		this.leftRibcage.setRotationPoint(7.0F, 3.0F, -4.0F);

		// Define head with 128x128 texture
		this.head = new Cube(0, 32, 128, 128);
		this.head.addBox(-8.0F, -16.0F, -5.0F, 16, 16, 10);
		this.head.setRotationPoint(0.0F, -10.0F, 0.0F);

		// Define right tendril with 128x128 texture
		this.rightTendril = new Cube(52, 32, 128, 128);
		this.rightTendril.addBox(-16.0F, -13.0F, 0.0F, 16, 16, 0);
		this.rightTendril.setRotationPoint(-8.0F, -20.0F, 0.0F);

		// Define left tendril with 128x128 texture
		this.leftTendril = new Cube(58, 0, 128, 128);
		this.leftTendril.addBox(0.0F, -13.0F, 0.0F, 16, 16, 0);
		this.leftTendril.setRotationPoint(8.0F, -20.0F, 0.0F);

		// Define right arm with 128x128 texture
		this.rightArm = new Cube(44, 50, 128, 128);
		this.rightArm.addBox(-4.0F, 0.0F, -4.0F, 8, 28, 8);
		this.rightArm.setRotationPoint(-13.0F, -13.0F, 1.0F);

		// Define left arm with 128x128 texture
		this.leftArm = new Cube(0, 58, 128, 128);
		this.leftArm.addBox(-4.0F, 0.0F, -4.0F, 8, 28, 8);
		this.leftArm.setRotationPoint(13.0F, -13.0F, 1.0F);

		// Define right leg with 128x128 texture
		this.rightLeg = new Cube(76, 48, 128, 128);
		this.rightLeg.addBox(-3.1F, 0.0F, -3.0F, 6, 13, 6);
		this.rightLeg.setRotationPoint(-5.9F, 11.0F, 0.0F);

		// Define left leg with 128x128 texture
		this.leftLeg = new Cube(76, 76, 128, 128);
		this.leftLeg.addBox(-2.9F, 0.0F, -3.0F, 6, 13, 6);
		this.leftLeg.setRotationPoint(5.9F, 11.0F, 0.0F);
	}

	@Override
	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);
		this.body.render(scale);
		this.rightRibcage.render(scale);
		this.leftRibcage.render(scale);
		this.head.render(scale);
		this.rightTendril.render(scale);
		this.leftTendril.render(scale);
		this.rightArm.render(scale);
		this.leftArm.render(scale);
		this.rightLeg.render(scale);
		this.leftLeg.render(scale);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.head.rotateAngleX = headPitch / 57.29578F;
		this.head.rotateAngleY = headYaw / 57.29578F;

		// Tendrils follow head movement
		this.rightTendril.rotateAngleX = this.head.rotateAngleX;
		this.rightTendril.rotateAngleY = this.head.rotateAngleY;
		this.leftTendril.rotateAngleX = this.head.rotateAngleX;
		this.leftTendril.rotateAngleY = this.head.rotateAngleY;

		// Arms and legs swing during movement
		this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbYaw;
		this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.141593F) * 1.4F * limbYaw;
		this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbYaw;
		this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.141593F) * 1.4F * limbYaw;
	}
}
