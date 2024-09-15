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
	public Cube leftItem;

	public ModelPiglin() {
		// Body
		this.body = new Cube(16, 16);
		this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
		this.body.setRotationPoint(0.0F, 0.0F, 0.0F);

		// Head
		this.head = new Cube(0, 0);
		this.head.addBox(-5.0F, -8.0F, -4.0F, 10, 8, 8);  // Head size
		this.head.setRotationPoint(0.0F, 0.0F, 0.0F);  // Adjust head pivot to top of body

		// Left Ear
		this.leftEar = new Cube(51, 6);
		this.leftEar.addBox(4.0F, -5.0F, -2.0F, 1, 5, 4);
		this.leftEar.setRotationPoint(5.5F, 0.0F, 0.0F);  // Move left ear further from head
		this.leftEar.rotateAngleZ = (float) Math.toRadians(-45);  // Keep the tilt angle for left ear

		// Right Ear
		this.rightEar = new Cube(39, 6);
		this.rightEar.addBox(-5.0F, -5.0F, -2.0F, 1, 5, 4);
		this.rightEar.setRotationPoint(-5.5F, 0.0F, 0.0F);  // Move right ear further from head
		this.rightEar.rotateAngleZ = (float) Math.toRadians(45);  // Keep the tilt angle for right ear

		// Right Arm
		this.rightArm = new Cube(40, 16);
		this.rightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);  // Arm size, moving pivot to the shoulder
		this.rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);  // Adjust arm pivot to shoulder

		// Left Arm
		this.leftArm = new Cube(32, 48);
		this.leftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);  // Arm size, moving pivot to the shoulder
		this.leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);  // Adjust arm pivot to shoulder

		// Right Leg
		this.rightLeg = new Cube(0, 16);
		this.rightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
		this.rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);  // Align legs to ground

		// Left Leg
		this.leftLeg = new Cube(16, 48);
		this.leftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
		this.leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);

		// Left Item
		this.leftItem = new Cube(0, 0);
		this.leftItem.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
		this.leftItem.setRotationPoint(6.0F, 15.0F, 1.0F);  // Adjust left item pivot
	}

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
		this.leftItem.render(scale);
	}

	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.head.rotateAngleX = headPitch / 57.29578F;
		this.head.rotateAngleY = headYaw / 57.29578F;

		// Make ears rotate with the head, preserving the tilt (rotateAngleZ)
		this.leftEar.rotateAngleX = this.head.rotateAngleX;
		this.leftEar.rotateAngleY = this.head.rotateAngleY;

		this.rightEar.rotateAngleX = this.head.rotateAngleX;
		this.rightEar.rotateAngleY = this.head.rotateAngleY;

		// Legs and arms rotation
		this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbYaw;
		this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.141593F) * 1.4F * limbYaw;

		this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbYaw;
		this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.141593F) * 1.4F * limbYaw;
	}
}
