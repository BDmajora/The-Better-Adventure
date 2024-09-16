package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class ModelBee extends ModelBase {

	public Cube body;
	public Cube stinger;
	public Cube rightWing;
	public Cube leftWing;
	public Cube legFront;
	public Cube legMid;
	public Cube legBack;

	public ModelBee() {
		// Bee body remains the same
		this.body = new Cube(0, 0);
		this.body.addBox(-3.5F, -4.0F, -5.0F, 7, 7, 10);
		this.body.setRotationPoint(0.5F, 19.0F, 0.0F);  // Y = 19.0F

		// Adjust stinger's position to be in line with the body
		this.stinger = new Cube(26, 7);
		this.stinger.addBox(0.0F, 0.0F, 4.0F, 0, 1, 2);
		this.stinger.setRotationPoint(0.0F, 18.0F, 1.0F);  // Y lowered to 18.0F

		// Adjust wing positions to be in line with the body
		this.rightWing = new Cube(0, 18);
		this.rightWing.addBox(-9.0F, 0.0F, 0.0F, 9, 0, 6);
		this.rightWing.setRotationPoint(-1.5F, 15.0F, -3.0F);  // Y lowered to 15.0F
		this.rightWing.rotateAngleX = (float) Math.toRadians(15);
		this.rightWing.rotateAngleY = (float) Math.toRadians(-15);

		this.leftWing = new Cube(9, 24);
		this.leftWing.addBox(0.0F, 0.0F, 0.0F, 9, 0, 6);
		this.leftWing.setRotationPoint(1.5F, 15.0F, -3.0F);  // Y lowered to 15.0F
		this.leftWing.rotateAngleX = (float) Math.toRadians(15);
		this.leftWing.rotateAngleY = (float) Math.toRadians(15);

		// Adjust leg positions to be in line with the body
		this.legFront = new Cube(26, 1);
		this.legFront.addBox(-5.0F, 0.0F, 0.0F, 7, 2, 0);
		this.legFront.setRotationPoint(1.5F, 22.0F, -2.0F);  // Y lowered to 22.0F

		this.legMid = new Cube(26, 3);
		this.legMid.addBox(-5.0F, 0.0F, 0.0F, 7, 2, 0);
		this.legMid.setRotationPoint(1.5F, 22.0F, 0.0F);  // Y lowered to 22.0F

		this.legBack = new Cube(26, 5);
		this.legBack.addBox(-5.0F, 0.0F, 0.0F, 7, 2, 0);
		this.legBack.setRotationPoint(1.5F, 22.0F, 2.0F);  // Y lowered to 22.0F
	}

	@Override
	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);
		this.body.render(scale);
		this.stinger.render(scale);
		this.rightWing.render(scale);
		this.leftWing.render(scale);
		this.legFront.render(scale);
		this.legMid.render(scale);
		this.legBack.render(scale);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		// Leg rotations
		this.legFront.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbYaw;
		this.legMid.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.141593F) * 1.4F * limbYaw;
		this.legBack.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbYaw;

		// Wing rotation logic (rotate based on body position and flap with limbPitch)
		this.rightWing.rotateAngleX = this.body.rotateAngleX + (float) Math.toRadians(15);
		this.rightWing.rotateAngleY = this.body.rotateAngleY + (float) Math.toRadians(-15);
		this.rightWing.rotateAngleZ = limbPitch;

		this.leftWing.rotateAngleX = this.body.rotateAngleX + (float) Math.toRadians(15);
		this.leftWing.rotateAngleY = this.body.rotateAngleY + (float) Math.toRadians(15);
		this.leftWing.rotateAngleZ = -limbPitch;

		// Stinger follows body rotation
		this.stinger.rotateAngleX = this.body.rotateAngleX + 0.25F;
		this.stinger.rotateAngleY = this.body.rotateAngleY;
	}
}
