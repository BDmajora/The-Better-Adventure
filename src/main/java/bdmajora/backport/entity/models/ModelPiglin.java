package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class ModelPiglin extends ModelBase {

	public Cube body;
	public Cube head;
	public Cube leftEar;
	public Cube rightEar;
	public Cube rightArm;
	public Cube leftArm;
	public Cube rightLeg;
	public Cube leftLeg;

	public ModelPiglin() {
		this.body = new Cube(16, 16);
		this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
		this.body.setRotationPoint(0.0F, 0.0F, 0.0F);

		this.head = new Cube(0, 0);
		this.head.addBox(-5.0F, -8.0F, -4.0F, 10, 8, 8);
		this.head.setRotationPoint(0.0F, 0.0F, 0.0F);

		this.leftEar = new Cube(51, 6);
		this.leftEar.addBox(4.0F, -5.0F, -2.0F, 1, 5, 4);
		this.leftEar.setRotationPoint(5.5F, 0.0F, 0.0F);
		this.leftEar.rotateAngleZ = (float) Math.toRadians(-45);

		this.rightEar = new Cube(39, 6);
		this.rightEar.addBox(-5.0F, -5.0F, -2.0F, 1, 5, 4);
		this.rightEar.setRotationPoint(-5.5F, 0.0F, 0.0F);
		this.rightEar.rotateAngleZ = (float) Math.toRadians(45);

		this.rightArm = new Cube(40, 16);
		this.rightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
		this.rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);

// Mirroring the right arm for the left arm
		this.leftArm = new Cube(40, 16); // Same texture position as the right arm
		this.leftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4); // Mirror the right arm's dimensions
		this.leftArm.setRotationPoint(5.0F, 2.0F, 0.0F); // Mirror the rotation point

		this.rightLeg = new Cube(0, 16);
		this.rightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
		this.rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);

// Mirroring the right leg for the left leg
		this.leftLeg = new Cube(0, 16); // Same texture position as the right leg
		this.leftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4); // Mirror the right leg's dimensions
		this.leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F); // Mirror the rotation point

	}

	@Override
	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);
		this.body.render(scale);
		this.head.render(scale);
		this.leftEar.render(scale);
		this.rightEar.render(scale);
		this.rightArm.render(scale);
		this.leftArm.render(scale);
		this.rightLeg.render(scale);
		this.leftLeg.render(scale);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.head.rotateAngleX = headPitch / 57.29578F;
		this.head.rotateAngleY = headYaw / 57.29578F;

		// Ears follow head movement
		this.leftEar.rotateAngleX = this.head.rotateAngleX;
		this.leftEar.rotateAngleY = this.head.rotateAngleY;

		this.rightEar.rotateAngleX = this.head.rotateAngleX;
		this.rightEar.rotateAngleY = this.head.rotateAngleY;

		// Arm and leg movement remain unchanged
		this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbYaw;
		this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.141593F) * 1.4F * limbYaw;

		this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbYaw;
		this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.141593F) * 1.4F * limbYaw;
	}


}
