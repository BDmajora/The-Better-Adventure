package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class ModelArmadillo extends ModelBase {

	public Cube head;
	public Cube body;
	public Cube rightFrontLeg;
	public Cube leftFrontLeg;
	public Cube rightHindLeg;
	public Cube leftHindLeg;
	public Cube tail;
	public Cube bodyRolledUp;
	public Cube rightEar;
	public Cube leftEar;
	public Cube bodyBottom;  // New bottom piece of the body

	private boolean isRolledUp;  // Flag to track if the armadillo is rolled up

	public ModelArmadillo() {
		// Main body
		this.body = new Cube(0, 20, 64, 64);
		this.body.addBox(-4.0F, -7.0F, -10.0F, 8, 8, 12);
		this.body.setRotationPoint(0.0F, 21.0F, 4.0F);

		// Bottom piece of the body
		this.bodyBottom = new Cube(0, 40, 64, 64);
		this.bodyBottom.addBox(-4.0F, 2.0F, -6.0F, 8, 8, 12, 0);
		this.bodyBottom.setRotationPoint(0.0F, 13.0F, 0.0F);

		// Tail
		this.tail = new Cube(44, 53, 64, 64);
		this.tail.addBox(-0.5F, -0.0865F, 0.0933F, 1, 6, 1);
		this.tail.setRotationPoint(0.0F, 18.0F, 6.0F);
		this.tail.rotateAngleX = 0.5061F;

		// Head
		this.head = new Cube(43, 15, 64, 64);
		this.head.addBox(-1.5F, -1.0F, -1.0F, 3, 5, 2);
		this.head.setRotationPoint(0.0F, 17.0F, -7.0F);
		this.head.rotateAngleX = -0.3927F;

		// Ears
		this.rightEar = new Cube(43, 10, 64, 64);
		this.rightEar.addBox(-2.0F, -3.0F, 0.0F, 2, 5, 0);
		this.rightEar.setRotationPoint(-1.0F, 17.0F, -7.0F);

		this.leftEar = new Cube(47, 10, 64, 64);
		this.leftEar.addBox(0.0F, -3.0F, 0.0F, 2, 5, 0);
		this.leftEar.setRotationPoint(1.0F, 17.0F, -7.0F);

		// Legs
		this.rightFrontLeg = new Cube(51, 43, 64, 64);
		this.rightFrontLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2);
		this.rightFrontLeg.setRotationPoint(-2.0F, 21.0F, -4.0F);

		this.leftFrontLeg = new Cube(42, 43, 64, 64);
		this.leftFrontLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2);
		this.leftFrontLeg.setRotationPoint(2.0F, 21.0F, -4.0F);

		this.rightHindLeg = new Cube(51, 31, 64, 64);
		this.rightHindLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2);
		this.rightHindLeg.setRotationPoint(-2.0F, 21.0F, 4.0F);

		this.leftHindLeg = new Cube(42, 31, 64, 64);
		this.leftHindLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2);
		this.leftHindLeg.setRotationPoint(2.0F, 21.0F, 4.0F);

		// Rolled up state
		this.bodyRolledUp = new Cube(0, 0, 64, 64);
		this.bodyRolledUp.addBox(-5.0F, -10.0F, -6.0F, 10, 10, 10);
		this.bodyRolledUp.setRotationPoint(0.0F, 24.0F, 27.0F);
	}

	public void setRolledUp(boolean rolledUp) {
		this.isRolledUp = rolledUp;
	}

	@Override
	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);

		this.head.render(scale);
		this.body.render(scale);
		this.bodyBottom.render(scale);  // Render body bottom
		this.rightFrontLeg.render(scale);
		this.leftFrontLeg.render(scale);
		this.rightHindLeg.render(scale);
		this.leftHindLeg.render(scale);
		this.tail.render(scale);
		this.rightEar.render(scale);
		this.leftEar.render(scale);

		if (this.isRolledUp) {
			this.bodyRolledUp.render(scale);
		}
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.head.rotateAngleX = headPitch / 57.29578F;
		this.head.rotateAngleY = headYaw / 57.29578F;

		float legSwingAmplitude = (float) Math.toRadians(15);
		float legSwingSpeed = limbSwing * 0.6662F;

		this.rightFrontLeg.rotateAngleX = MathHelper.cos(legSwingSpeed) * legSwingAmplitude;
		this.leftFrontLeg.rotateAngleX = MathHelper.cos(legSwingSpeed + (float) Math.PI) * legSwingAmplitude;
		this.rightHindLeg.rotateAngleX = MathHelper.cos(legSwingSpeed + (float) Math.PI) * legSwingAmplitude;
		this.leftHindLeg.rotateAngleX = MathHelper.cos(legSwingSpeed) * legSwingAmplitude;

		this.tail.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * (float) Math.toRadians(5);
	}
}
