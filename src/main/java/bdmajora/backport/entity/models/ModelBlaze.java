package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class ModelBlaze extends ModelBase {

	public Cube upperBodyParts0;
	public Cube upperBodyParts1;
	public Cube upperBodyParts2;
	public Cube upperBodyParts3;
	public Cube upperBodyParts4;
	public Cube upperBodyParts5;
	public Cube upperBodyParts6;
	public Cube upperBodyParts7;
	public Cube upperBodyParts8;
	public Cube upperBodyParts9;
	public Cube upperBodyParts10;
	public Cube upperBodyParts11;
	public Cube head;

	public ModelBlaze() {
		this.upperBodyParts0 = new Cube(0, 16);
		this.upperBodyParts0.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts0.setRotationPoint(8.0F, -2.0F, -3.0F);

		this.upperBodyParts1 = new Cube(0, 16);
		this.upperBodyParts1.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts1.setRotationPoint(-10.0F, -2.0F, 1.0F);

		this.upperBodyParts2 = new Cube(0, 16);
		this.upperBodyParts2.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts2.setRotationPoint(1.0F, -2.0F, 8.0F);

		this.upperBodyParts3 = new Cube(0, 16);
		this.upperBodyParts3.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts3.setRotationPoint(-3.0F, -2.0F, -10.0F);

		this.upperBodyParts4 = new Cube(0, 16);
		this.upperBodyParts4.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts4.setRotationPoint(5.0F, 6.0F, -1.0F);

		this.upperBodyParts5 = new Cube(0, 16);
		this.upperBodyParts5.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts5.setRotationPoint(-7.0F, 6.0F, -1.0F);

		this.upperBodyParts6 = new Cube(0, 16);
		this.upperBodyParts6.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts6.setRotationPoint(-1.0F, 6.0F, 5.0F);

		this.upperBodyParts7 = new Cube(0, 16);
		this.upperBodyParts7.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts7.setRotationPoint(-1.0F, 6.0F, -7.0F);

		this.upperBodyParts8 = new Cube(0, 16);
		this.upperBodyParts8.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts8.setRotationPoint(3.0F, 16.0F, 2.0F);

		this.upperBodyParts9 = new Cube(0, 16);
		this.upperBodyParts9.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts9.setRotationPoint(-5.0F, 16.0F, -4.0F);

		this.upperBodyParts10 = new Cube(0, 16);
		this.upperBodyParts10.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts10.setRotationPoint(-4.0F, 16.0F, 3.0F);

		this.upperBodyParts11 = new Cube(0, 16);
		this.upperBodyParts11.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts11.setRotationPoint(2.0F, 16.0F, -5.0F);

		this.head = new Cube(0, 0);
		this.head.addBox(-4, -4, -4, 8, 8, 8);
		this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
	}

	@Override
	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);
		this.upperBodyParts0.render(scale);
		this.upperBodyParts1.render(scale);
		this.upperBodyParts2.render(scale);
		this.upperBodyParts3.render(scale);
		this.upperBodyParts4.render(scale);
		this.upperBodyParts5.render(scale);
		this.upperBodyParts6.render(scale);
		this.upperBodyParts7.render(scale);
		this.upperBodyParts8.render(scale);
		this.upperBodyParts9.render(scale);
		this.upperBodyParts10.render(scale);
		this.upperBodyParts11.render(scale);
		this.head.render(scale);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		// Time-based animation for continuous rotation
		float ticks = (float) (System.currentTimeMillis() % 10000L) / 1000.0F;

		// Full speed for body parts 0-3
		float rotationSpeedFast = -ticks * 10.0F;  // Reversed direction for 0-3
		// Two-thirds speed for body parts 4-7
		float rotationSpeedMedium = ticks * (10.0F * 2 / 3);  // Opposite direction for 4-7
		// One-third speed for body parts 8-11
		float rotationSpeedSlow = -ticks * (10.0F / 3);  // Same direction as 0-3 but slower

		float distanceFromHead = 8.0F;  // Distance of the body parts from the head

		// Rotating bodyPart0-3 around the head (reverse direction)
		this.upperBodyParts0.rotationPointX = this.head.rotationPointX + MathHelper.cos(rotationSpeedFast) * distanceFromHead;
		this.upperBodyParts0.rotationPointZ = this.head.rotationPointZ + MathHelper.sin(rotationSpeedFast) * distanceFromHead;

		this.upperBodyParts1.rotationPointX = this.head.rotationPointX + MathHelper.cos(rotationSpeedFast + (float) Math.PI / 2) * distanceFromHead;
		this.upperBodyParts1.rotationPointZ = this.head.rotationPointZ + MathHelper.sin(rotationSpeedFast + (float) Math.PI / 2) * distanceFromHead;

		this.upperBodyParts2.rotationPointX = this.head.rotationPointX + MathHelper.cos(rotationSpeedFast + (float) Math.PI) * distanceFromHead;
		this.upperBodyParts2.rotationPointZ = this.head.rotationPointZ + MathHelper.sin(rotationSpeedFast + (float) Math.PI) * distanceFromHead;

		this.upperBodyParts3.rotationPointX = this.head.rotationPointX + MathHelper.cos(rotationSpeedFast + (3 * (float) Math.PI / 2)) * distanceFromHead;
		this.upperBodyParts3.rotationPointZ = this.head.rotationPointZ + MathHelper.sin(rotationSpeedFast + (3 * (float) Math.PI / 2)) * distanceFromHead;

		// Rotating bodyPart4-7 in the opposite direction, two-thirds the speed
		this.upperBodyParts4.rotationPointX = this.head.rotationPointX + MathHelper.cos(rotationSpeedMedium) * distanceFromHead;
		this.upperBodyParts4.rotationPointZ = this.head.rotationPointZ + MathHelper.sin(rotationSpeedMedium) * distanceFromHead;

		this.upperBodyParts5.rotationPointX = this.head.rotationPointX + MathHelper.cos(rotationSpeedMedium + (float) Math.PI / 2) * distanceFromHead;
		this.upperBodyParts5.rotationPointZ = this.head.rotationPointZ + MathHelper.sin(rotationSpeedMedium + (float) Math.PI / 2) * distanceFromHead;

		this.upperBodyParts6.rotationPointX = this.head.rotationPointX + MathHelper.cos(rotationSpeedMedium + (float) Math.PI) * distanceFromHead;
		this.upperBodyParts6.rotationPointZ = this.head.rotationPointZ + MathHelper.sin(rotationSpeedMedium + (float) Math.PI) * distanceFromHead;

		this.upperBodyParts7.rotationPointX = this.head.rotationPointX + MathHelper.cos(rotationSpeedMedium + (3 * (float) Math.PI / 2)) * distanceFromHead;
		this.upperBodyParts7.rotationPointZ = this.head.rotationPointZ + MathHelper.sin(rotationSpeedMedium + (3 * (float) Math.PI / 2)) * distanceFromHead;

		// Rotating bodyPart8-11 in the same direction as 0-3, but one-third the speed
		this.upperBodyParts8.rotationPointX = this.head.rotationPointX + MathHelper.cos(rotationSpeedSlow) * distanceFromHead;
		this.upperBodyParts8.rotationPointZ = this.head.rotationPointZ + MathHelper.sin(rotationSpeedSlow) * distanceFromHead;

		this.upperBodyParts9.rotationPointX = this.head.rotationPointX + MathHelper.cos(rotationSpeedSlow + (float) Math.PI / 2) * distanceFromHead;
		this.upperBodyParts9.rotationPointZ = this.head.rotationPointZ + MathHelper.sin(rotationSpeedSlow + (float) Math.PI / 2) * distanceFromHead;

		this.upperBodyParts10.rotationPointX = this.head.rotationPointX + MathHelper.cos(rotationSpeedSlow + (float) Math.PI) * distanceFromHead;
		this.upperBodyParts10.rotationPointZ = this.head.rotationPointZ + MathHelper.sin(rotationSpeedSlow + (float) Math.PI) * distanceFromHead;

		this.upperBodyParts11.rotationPointX = this.head.rotationPointX + MathHelper.cos(rotationSpeedSlow + (3 * (float) Math.PI / 2)) * distanceFromHead;
		this.upperBodyParts11.rotationPointZ = this.head.rotationPointZ + MathHelper.sin(rotationSpeedSlow + (3 * (float) Math.PI / 2)) * distanceFromHead;

		// Set head rotation
		this.head.rotateAngleX = headPitch / 57.29578F;  // Convert degrees to radians
		this.head.rotateAngleY = headYaw / 57.29578F;
	}

}
