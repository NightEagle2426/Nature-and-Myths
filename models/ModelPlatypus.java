
/**
 * Platypus - NightEagle2426 Created using Tabula 7.1.0
 */
public static class ModelPlatypus extends ModelBase {
	public ModelRenderer Body1;
	public ModelRenderer Body2;
	public ModelRenderer Head;
	public ModelRenderer Frontlegleft;
	public ModelRenderer Frontlegleft_1;
	public ModelRenderer Tail1;
	public ModelRenderer Leftlegback;
	public ModelRenderer Rightlegback;
	public ModelRenderer tail2;
	public ModelRenderer shape11;
	public ModelRenderer shape12;
	public ModelRenderer shape11_1;
	public ModelRenderer shape12_1;
	public ModelRenderer beak1;
	public ModelRenderer beak2;
	public ModelRenderer feet;
	public ModelRenderer feet_1;

	public ModelPlatypus() {
		this.textureWidth = 75;
		this.textureHeight = 50;
		this.Rightlegback = new ModelRenderer(this, 44, 0);
		this.Rightlegback.setRotationPoint(-3.4F, 2.5F, -2.6F);
		this.Rightlegback.addBox(0.0F, 0.0F, 0.2F, 1, 1, 2, 0.0F);
		this.shape12_1 = new ModelRenderer(this, 58, 6);
		this.shape12_1.setRotationPoint(0.0F, 1.0F, -1.0F);
		this.shape12_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.beak2 = new ModelRenderer(this, 25, 12);
		this.beak2.setRotationPoint(0.5F, 0.0F, -0.7F);
		this.beak2.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
		this.Body1 = new ModelRenderer(this, 0, 0);
		this.Body1.setRotationPoint(0.0F, 19.0F, 4.5F);
		this.Body1.addBox(-2.5F, 0.0F, -10.8F, 6, 4, 7, 0.0F);
		this.setRotateAngle(Body1, 0.0F, 0.0F, -0.0017453292519943296F);
		this.feet_1 = new ModelRenderer(this, 58, 6);
		this.feet_1.setRotationPoint(0.0F, 1.0F, -1.0F);
		this.feet_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.shape12 = new ModelRenderer(this, 58, 6);
		this.shape12.setRotationPoint(0.0F, 1.0F, -1.0F);
		this.shape12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.shape11_1 = new ModelRenderer(this, 3, 2);
		this.shape11_1.setRotationPoint(0.0F, 0.3F, 1.0F);
		this.shape11_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.Frontlegleft_1 = new ModelRenderer(this, 0, 0);
		this.Frontlegleft_1.setRotationPoint(-2.9F, 3.0F, -9.9F);
		this.Frontlegleft_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.Tail1 = new ModelRenderer(this, 38, 6);
		this.Tail1.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.Tail1.addBox(-2.0F, 0.0F, 0.0F, 5, 1, 10, 0.0F);
		this.tail2 = new ModelRenderer(this, 61, 0);
		this.tail2.setRotationPoint(-1.5F, 0.0F, 9.8F);
		this.tail2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
		this.feet = new ModelRenderer(this, 58, 6);
		this.feet.setRotationPoint(0.0F, 1.0F, -1.0F);
		this.feet.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.Body2 = new ModelRenderer(this, 26, 0);
		this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body2.addBox(-3.0F, 0.0F, -4.0F, 7, 4, 4, 0.0F);
		this.Leftlegback = new ModelRenderer(this, 23, 0);
		this.Leftlegback.setRotationPoint(3.4F, 2.5F, -2.6F);
		this.Leftlegback.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.Head = new ModelRenderer(this, 48, 0);
		this.Head.setRotationPoint(0.5F, 1.0F, -10.8F);
		this.Head.addBox(-2.5F, -1.3F, -3.0F, 5, 3, 3, 0.0F);
		this.shape11 = new ModelRenderer(this, 70, 1);
		this.shape11.setRotationPoint(0.0F, 0.3F, 1.0F);
		this.shape11.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.beak1 = new ModelRenderer(this, 21, 8);
		this.beak1.setRotationPoint(-2.0F, 0.9F, -6.9F);
		this.beak1.addBox(0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
		this.Frontlegleft = new ModelRenderer(this, 0, 0);
		this.Frontlegleft.setRotationPoint(2.9F, 3.0F, -9.9F);
		this.Frontlegleft.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.Body2.addChild(this.Rightlegback);
		this.shape11_1.addChild(this.shape12_1);
		this.beak1.addChild(this.beak2);
		this.Frontlegleft_1.addChild(this.feet_1);
		this.shape11.addChild(this.shape12);
		this.Rightlegback.addChild(this.shape11_1);
		this.Body1.addChild(this.Frontlegleft_1);
		this.Body2.addChild(this.Tail1);
		this.Tail1.addChild(this.tail2);
		this.Frontlegleft.addChild(this.feet);
		this.Body1.addChild(this.Body2);
		this.Body2.addChild(this.Leftlegback);
		this.Body1.addChild(this.Head);
		this.Leftlegback.addChild(this.shape11);
		this.Head.addChild(this.beak1);
		this.Body1.addChild(this.Frontlegleft);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.Body1.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Frontlegleft.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Frontlegleft_1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Leftlegback.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Rightlegback.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}
