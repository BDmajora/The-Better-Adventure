package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class ModelBat extends ModelBase {

	public Cube head;
	public Cube rightEar;
	public Cube leftEar;
	public Cube body;
	public Cube feet;
	public Cube rightWing;
	public Cube rightWingTip;
	public Cube leftWing;
	public Cube leftWingTip;

	public ModelBat() {

		// Define head with texture dimensions
		this.head = new Cube(0, 7, 32, 32);
		this.head.addBox(-2.0F, -3.0F, -1.0F, 4, 3, 2);
		this.head.setRotationPoint(0.0F, 0.0F, 0.0F);

		// Define right ear with texture dimensions
		this.rightEar = new Cube(1, 15, 32, 32);
		this.rightEar.addBox(-2.5F, -4.0F, 0.0F, 3, 5, 0);
		this.rightEar.setRotationPoint(-1.5F, -2.0F, 0.0F);

		// Define left ear with texture dimensions
		this.leftEar = new Cube(8, 15, 32, 32);
		this.leftEar.addBox(-0.1F, -3.0F, 0.0F, 3, 5, 0);
		this.leftEar.setRotationPoint(1.1F, -3.0F, 0.0F);

		// Define body with texture dimensions
		this.body = new Cube(0, 0, 32, 32);
		this.body.addBox(-1.5F, 0.0F, -1.0F, 3, 5, 2);
		this.body.setRotationPoint(0.0F, 0.0F, 0.0F);

		// Define feet with texture dimensions
		this.feet = new Cube(16, 16, 32, 32);
		this.feet.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 0);
		this.feet.setRotationPoint(0.0F, 3.0F, 4.0F);

		// Initialize and define wings
		this.rightWing = new Cube(12, 0, 32, 32);
		this.rightWing.addBox(-2.0F, -2.0F, 0.0F, 2, 7, 0);
		this.rightWing.setRotationPoint(-1.5F, 0.0F, 0.0F);

		this.rightWingTip = new Cube(16, 0, 32, 32);
		this.rightWingTip.addBox(-6.0F, -2.0F, 0.0F, 6, 8, 0);
		this.rightWingTip.setRotationPoint(-2.0F, 0.0F, 0.0F);

		this.leftWing = new Cube(12, 7, 32, 32);
		this.leftWing.addBox(0.0F, -2.0F, 0.0F, 2, 7, 0);
		this.leftWing.setRotationPoint(1.5F, 0.0F, 0.0F);

		this.leftWingTip = new Cube(16, 8, 32, 32);
		this.leftWingTip.addBox(0.0F, -2.0F, 0.0F, 6, 8, 0);
		this.leftWingTip.setRotationPoint(2.0F, 0.0F, 0.0F);
	}

	@Override
	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);

		this.head.render(scale);
		this.rightEar.render(scale);
		this.leftEar.render(scale);
		this.body.render(scale);
		this.feet.render(scale);
		this.rightWing.render(scale);  // Render wings
		this.rightWingTip.render(scale);  // Render wing tips
		this.leftWing.render(scale);
		this.leftWingTip.render(scale);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		// Rotate head and synchronize ear movement with head
		this.head.rotateAngleX = headPitch / 57.29578F;
		this.head.rotateAngleY = headYaw / 57.29578F;

		this.leftEar.rotateAngleX = this.head.rotateAngleX;
		this.leftEar.rotateAngleY = this.head.rotateAngleY;
		this.rightEar.rotateAngleX = this.head.rotateAngleX;
		this.rightEar.rotateAngleY = this.head.rotateAngleY;

		// Apply a 45-degree (π/4 radians) tilt to the body
		this.body.rotateAngleX = (float) Math.toRadians(45);  // Tilt body backward by 45 degrees

		// Apply a 45-degree tilt to both wings and wing tips
		this.rightWing.rotateAngleX = (float) Math.toRadians(45);
		this.rightWingTip.rotateAngleX = (float) Math.toRadians(45);
		this.leftWing.rotateAngleX = (float) Math.toRadians(45);
		this.leftWingTip.rotateAngleX = (float) Math.toRadians(45);

		// Apply the same 45-degree tilt to the feet
		this.feet.rotateAngleX = (float) Math.toRadians(45);

		// Time-based animation for continuous wing flapping
		float ticks = (float) (System.currentTimeMillis() % 10000L) / 1000.0F;

		float wingRestingAngle = (float) Math.toRadians(10);  // Resting angle for wings
		float wingFlapSpeed = ticks * 8.0F;  // Doubled flap speed
		float wingFlapAmplitude = (float) Math.toRadians(60);  // Wider amplitude for large flaps

		// Right wing movement
		this.rightWing.rotateAngleY = -wingRestingAngle + MathHelper.cos(wingFlapSpeed + (float) Math.PI) * wingFlapAmplitude;
		this.rightWingTip.rotateAngleY = this.rightWing.rotateAngleY;

		// Left wing movement
		this.leftWing.rotateAngleY = wingRestingAngle + MathHelper.cos(wingFlapSpeed) * wingFlapAmplitude;
		this.leftWingTip.rotateAngleY = this.leftWing.rotateAngleY;
	}
}
