package bdmajora.backport.block.DynamicTextures;

import com.b100.json.element.JsonObject;
import java.awt.image.BufferedImage;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.dynamictexture.DynamicTexture;
import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.client.render.texturepack.TexturePack;
import net.minecraft.client.render.texturepack.TexturePackException;
import net.minecraft.client.util.helper.TexturePackJsonHelper;
import net.minecraft.client.util.helper.Textures;

import static bdmajora.backport.backport.MOD_ID;

public class DynamicTextureCrimsonStem extends DynamicTexture {
	private static Random rand = new Random();
	private int frameCount;
	private byte[] frameData;
	private int[] frames;
	private int frametime = 1;
	private boolean random = false;
	private boolean interpolate = false;
	private boolean tile2x2 = false;
	private int currentFrame = -1;
	private int previousFrame = -1;
	private int nextFrameDelay = 0;

	public DynamicTextureCrimsonStem(Minecraft mc, TexturePack texturePack) {
		super();
		String animationSource = MOD_ID + ":block/crimson_stem.png"; // Path to the animation source
		String texturePath = MOD_ID + ":block/crimson_stem"; // Path to the texture with namespace key

		IconCoordinate texture = TextureRegistry.getTexture(texturePath);
		BufferedImage image = null;

		try {
			image = Textures.readImage(texturePack.getResourceAsStream(animationSource));

			if (image == null) {
				throw new TexturePackException("Could not load image!");
			}

			if (image.getHeight() < image.getWidth()) {
				throw new TexturePackException("Height is smaller than width!");
			}

		} catch (Exception e) {
			throw new TexturePackException("Error in animation " + animationSource, e);
		}

		this.frameCount = image.getHeight() / image.getWidth();
		String jsonFilePath = animationSource.replace(".png", ".json");
		JsonObject rootObject = null;

		if (texturePack.hasFile(jsonFilePath)) {
			try {
				rootObject = TexturePackJsonHelper.readJsonObject(texturePack, jsonFilePath);

				if (rootObject.has("frametime")) {
					this.frametime = TexturePackJsonHelper.getInteger(rootObject, "frametime");
				}

				if (rootObject.has("random")) {
					this.random = TexturePackJsonHelper.getBoolean(rootObject, "random");
				}

				if (rootObject.has("interpolate")) {
					this.interpolate = TexturePackJsonHelper.getBoolean(rootObject, "interpolate");
				}

				if (rootObject.has("frames")) {
					this.frames = TexturePackJsonHelper.getIntArray(rootObject, "frames");

					for (int res = 0; res < this.frames.length; ++res) {
						if (this.frames[res] >= this.frameCount) {
							throw new TexturePackException("Invalid frame number: " + this.frames[res]);
						}
					}
				}

				if (rootObject.has("tile2x2")) {
					this.tile2x2 = TexturePackJsonHelper.getBoolean(rootObject, "tile2x2");
				}
			} catch (Exception e) {
				throw new TexturePackException("Error in " + jsonFilePath, e);
			}
		}

		int tileCount = this.tile2x2 ? 2 : 1;
		int res = image.getWidth();
		int tiledRes = res * tileCount;
		texture.setDimension(tiledRes, tiledRes);
		texture.parentAtlas.dontSetSize.add(texture);
		this.setTexture(texture);
		this.frameData = new byte[tiledRes * tiledRes * 4 * this.frameCount];

		for (int frame = 0; frame < this.frameCount; ++frame) {
			for (int x = 0; x < res; ++x) {
				for (int y = 0; y < res; ++y) {
					int c = image.getRGB(x, frame * res + y);

					for (int tileX = 0; tileX < tileCount; ++tileX) {
						for (int tileY = 0; tileY < tileCount; ++tileY) {
							int x1 = tileX * res + x;
							int y1 = tileY * res + y;
							int i = frame * tiledRes * tiledRes + y1 * tiledRes + x1;
							putPixel(this.frameData, i, c);
						}
					}
				}
			}
		}
	}

	public void postInit() {
	}

	public void update() {
		if (this.interpolate) {
			if (this.nextFrameDelay > 0) {
				--this.nextFrameDelay;
			}

			if (this.nextFrameDelay <= 0) {
				this.nextFrameDelay = this.frametime;
				this.previousFrame = this.currentFrame;
				this.currentFrame = this.getNextFrame();
			}

			float blendFactor = 1.0F - (float) this.nextFrameDelay / (float) this.frametime;
			if (this.previousFrame == -1) {
				this.transferFrame(this.currentFrame);
			} else {
				this.transferBlendedFrame(this.previousFrame, this.currentFrame, blendFactor);
			}
		} else {
			if (this.nextFrameDelay > 0) {
				--this.nextFrameDelay;
				if (this.nextFrameDelay > 0) {
					return;
				}
			}

			this.nextFrameDelay = this.frametime;
			this.previousFrame = this.currentFrame;
			this.currentFrame = this.getNextFrame();
			if (this.currentFrame != this.previousFrame) {
				this.transferFrame(this.currentFrame);
			}
		}
	}

	private int getNextFrame() {
		int max = this.frameCount;
		if (this.frames != null) {
			max = this.frames.length;
		}

		return this.random ? rand.nextInt(max) : (this.currentFrame + 1) % max;
	}

	private void transferFrame(int frame) {
		if (this.frames != null) {
			frame = this.frames[frame];
		}

		for (int x0 = 0; x0 < this.texture.width; ++x0) {
			for (int y0 = 0; y0 < this.texture.height; ++y0) {
				int i = frame * this.texture.getArea() + y0 * this.texture.width + x0 << 2;
				int j = y0 * this.texture.height + x0 << 2;
				this.imageData[j + 0] = this.frameData[i + 0];
				this.imageData[j + 1] = this.frameData[i + 1];
				this.imageData[j + 2] = this.frameData[i + 2];
				this.imageData[j + 3] = this.frameData[i + 3];
			}
		}
	}

	private void transferBlendedFrame(int frame1, int frame2, float blendFactor) {
		if (blendFactor <= 0.0F) {
			this.transferFrame(frame1);
		} else if (blendFactor >= 1.0F) {
			this.transferFrame(frame2);
		} else {
			if (this.frames != null) {
				frame1 = this.frames[frame1];
				frame2 = this.frames[frame2];
			}

			for (int x0 = 0; x0 < this.texture.width; ++x0) {
				for (int y0 = 0; y0 < this.texture.height; ++y0) {
					int i = frame1 * this.texture.getArea() + y0 * this.texture.width + x0 << 2;
					int j = frame2 * this.texture.getArea() + y0 * this.texture.width + x0 << 2;
					int k = y0 * this.texture.width + x0 << 2;
					this.imageData[k + 0] = this.blend(this.frameData[i + 0], this.frameData[j + 0], blendFactor);
					this.imageData[k + 1] = this.blend(this.frameData[i + 1], this.frameData[j + 1], blendFactor);
					this.imageData[k + 2] = this.blend(this.frameData[i + 2], this.frameData[j + 2], blendFactor);
					this.imageData[k + 3] = this.blend(this.frameData[i + 3], this.frameData[j + 3], blendFactor);
				}
			}
		}
	}

	private byte blend(int a, int b, float factor) {
		int c = (int) ((float) (a & 255) * (1.0F - factor) + (float) (b & 255) * factor);
		return (byte) c;
	}

	public static void putPixel(byte[] frameData, int index, int color) {
		frameData[index + 0] = (byte) (color >> 16 & 255);
		frameData[index + 1] = (byte) (color >> 8 & 255);
		frameData[index + 2] = (byte) (color & 255);
		frameData[index + 3] = (byte) (color >> 24 & 255);
	}
}
