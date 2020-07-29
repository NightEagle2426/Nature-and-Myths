
/**
 * Kiwi - NightEagle2426 Created using Tabula 7.1.0
 */
public static class ModelKiwi extends ModelBase {
	public double[] modelScale = new double[]{1.2D, 1.2D, 1.2D};
	public ModelRenderer Body;
	public ModelRenderer Head1;
	public ModelRenderer Leg1;
	public ModelRenderer Leg2;
	public ModelRenderer Bodys1;
	public ModelRenderer Bodys2;
	public ModelRenderer Head2;
	public ModelRenderer Pico;
	public ModelRenderer toe11;
	public ModelRenderer toe21;

	public ModelKiwi() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.Head2 = new ModelRenderer(this, 41, 0);
		this.Head2.setRotationPoint(-1.0F, 0.3F, -3.1F);
		this.Head2.addBox(0.0F, -1.1F, 0.0F, 3, 3, 1, 0.0F);
		this.Pico = new ModelRenderer(this, 26, 7);
		this.Pico.setRotationPoint(1.0F, 1.5F, -5.0F);
		this.Pico.addBox(0.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F);
		this.toe21 = new ModelRenderer(this, 55, 0);
		this.toe21.setRotationPoint(0.0F, 1.0F, 1.0F);
		this.toe21.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
		this.Head1 = new ModelRenderer(this, 19, 0);
		this.Head1.setRotationPoint(2.6F, 2.0F, 0.0F);
		this.Head1.addBox(-1.6F, -1.6F, -2.6F, 4, 4, 3, 0.0F);
		this.setRotateAngle(Head1, 0.091106186954104F, 0.0F, 0.0F);
		this.Bodys1 = new ModelRenderer(this, 33, 0);
		this.Bodys1.setRotationPoint(-0.5F, 0.5F, 0.4F);
		this.Bodys1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
		this.Leg1 = new ModelRenderer(this, 0, 0);
		this.Leg1.setRotationPoint(0.2F, 5.4F, 4.0F);
		this.Leg1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.Body = new ModelRenderer(this, 0, 0);
		this.Body.setRotationPoint(0.0F, 17.0F, 0.0F);
		this.Body.addBox(0.0F, 0.0F, 0.0F, 6, 6, 7, 0.0F);
		this.Bodys2 = new ModelRenderer(this, 47, 0);
		this.Bodys2.setRotationPoint(5.5F, 0.5F, 0.4F);
		this.Bodys2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
		this.toe11 = new ModelRenderer(this, 55, 0);
		this.toe11.setRotationPoint(0.0F, 1.0F, 1.0F);
		this.toe11.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
		this.Leg2 = new ModelRenderer(this, 30, 0);
		this.Leg2.setRotationPoint(4.8F, 5.4F, 4.0F);
		this.Leg2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.Head1.addChild(this.Head2);
		this.Head2.addChild(this.Pico);
		this.Leg2.addChild(this.toe21);
		this.Body.addChild(this.Head1);
		this.Body.addChild(this.Bodys1);
		this.Body.addChild(this.Leg1);
		this.Body.addChild(this.Bodys2);
		this.Leg1.addChild(this.toe11);
		this.Body.addChild(this.Leg2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.pushMatrix();
		GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
		this.Body.render(f5);
		GlStateManager.popMatrix();
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
		this.Leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head1.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head1.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}
