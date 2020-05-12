// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer Legbackleft;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer Legbackright;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer neck;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer cabeza;
	private final ModelRenderer madibulainf;
	private final ModelRenderer mandibulasup;
	private final ModelRenderer legrightfront;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer legrightfront2;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;

	public Modelcustom_model() {
		textureWidth = 256;
		textureHeight = 256;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-5.0F, 27.0F, -1.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, 1.0F, -10.0F, -25.0F, 12, 5,
				32, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 37, 1.0F, -11.0F, -24.0F, 12,
				2, 30, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 54, 37, 2.0F, -12.0F, -22.0F, 10,
				2, 24, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 56, 0, 0.0F, -10.0F, -23.0F, 2, 5,
				26, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 58, 63, 12.0F, -10.0F, -23.0F, 2,
				5, 26, 0.0F, false));

		Legbackleft = new ModelRenderer(this);
		Legbackleft.setRotationPoint(1.0F, -3.0F, 1.0F);
		setRotationAngle(Legbackleft, 0.0F, -0.2618F, 0.0F);
		Body.addChild(Legbackleft);
		Legbackleft.cubeList.add(new ModelBox(Legbackleft, 0, 10, 12.0F, -6.0F,
				-4.0F, 3, 2, 9, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(3.4848F, 2.0F, 5.2779F);
		setRotationAngle(bone3, -0.2618F, 0.1745F, 0.0F);
		Legbackleft.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 14, 2, 10.2564F, -5.0F,
				-8.7119F, 1, 2, 8, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.9052F, -3.2007F, 0.3542F);
		setRotationAngle(bone4, 0.2618F, 0.0F, 0.0F);
		bone3.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 12, 39, 12.4205F, -0.6842F,
				-6.1786F, 1, 1, 6, 0.0F, false));

		Legbackright = new ModelRenderer(this);
		Legbackright.setRotationPoint(-21.0F, -3.0F, 2.0F);
		setRotationAngle(Legbackright, 0.0F, 0.3491F, 0.0F);
		Body.addChild(Legbackright);
		Legbackright.cubeList.add(new ModelBox(Legbackright, 0, 0, 17.2772F,
				-6.0F, 4.9468F, 3, 2, 8, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(5.9618F, 2.0F, 7.2437F);
		setRotationAngle(bone5, -0.2618F, -0.4363F, 0.0F);
		Legbackright.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 14, 14, 10.2564F, -5.0F,
				-8.7119F, 1, 2, 8, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.9052F, -3.2007F, 0.3542F);
		setRotationAngle(bone6, 0.2618F, 0.1745F, 0.0F);
		bone5.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 18, 24, 12.4263F, -0.6801F,
				-5.1786F, 1, 1, 6, 0.0F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, -3.0F, 1.0F);
		Body.addChild(neck);
		neck.cubeList.add(new ModelBox(neck, 88, 63, 2.0F, -7.0F, -34.0F, 10,
				5, 10, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.0F, -8.0F, -33.0F, 8, 1,
				9, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(7.0F, -3.0F, 1.0F);
		Body.addChild(tail);
		tail.cubeList.add(new ModelBox(tail, 0, 90, -4.0F, -7.0F, -5.0F, 8, 5,
				12, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 37, -3.0F, -7.0F, 6.0F, 6, 5,
				3, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(tail2);
		tail2.cubeList.add(new ModelBox(tail2, 0, 69, -3.0F, -6.0F, 6.0F, 6, 4,
				17, 0.0F, false));

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail2.addChild(tail3);
		tail3.cubeList.add(new ModelBox(tail3, 28, 76, -2.0F, -6.0F, 19.0F, 4,
				5, 18, 0.0F, false));
		tail3.cubeList.add(new ModelBox(tail3, 86, 0, -1.0F, -8.0F, 34.0F, 2,
				7, 16, 0.0F, false));
		tail3.cubeList.add(new ModelBox(tail3, 0, 45, -1.0F, -7.0F, 50.0F, 2,
				6, 4, 0.0F, false));
		tail3.cubeList.add(new ModelBox(tail3, 0, 20, -1.0F, -6.0F, 52.0F, 2,
				5, 7, 0.0F, false));
		tail3.cubeList.add(new ModelBox(tail3, 0, 20, -1.0F, -5.0F, 56.0F, 2,
				4, 8, 0.0F, false));

		cabeza = new ModelRenderer(this);
		cabeza.setRotationPoint(0.0F, -6.0F, 1.0F);
		Body.addChild(cabeza);
		cabeza.cubeList.add(new ModelBox(cabeza, 0, 0, 3.0F, -5.0F, -37.0F, 8,
				4, 4, 0.0F, false));
		cabeza.cubeList.add(new ModelBox(cabeza, 0, 0, 4.0F, -4.0F, -39.0F, 6,
				3, 4, 0.0F, false));

		madibulainf = new ModelRenderer(this);
		madibulainf.setRotationPoint(7.0F, 4.0F, 0.0F);
		cabeza.addChild(madibulainf);
		madibulainf.cubeList.add(new ModelBox(madibulainf, 0, 0, -3.0F, -5.0F,
				-49.0F, 6, 1, 11, 0.0F, false));
		madibulainf.cubeList.add(new ModelBox(madibulainf, 0, 0, -4.0F, -5.0F,
				-39.0F, 8, 1, 5, 0.0F, false));
		madibulainf.cubeList.add(new ModelBox(madibulainf, 0, 0, -3.0F, -4.0F,
				-46.0F, 6, 1, 11, 0.0F, false));
		madibulainf.cubeList.add(new ModelBox(madibulainf, 0, 0, -2.0F, -4.0F,
				-52.0F, 4, 1, 6, 0.0F, false));
		madibulainf.cubeList.add(new ModelBox(madibulainf, 0, 0, -2.0F, -5.0F,
				-54.0F, 4, 1, 5, 0.0F, false));

		mandibulasup = new ModelRenderer(this);
		mandibulasup.setRotationPoint(0.0F, 0.0F, 0.0F);
		cabeza.addChild(mandibulasup);
		mandibulasup.cubeList.add(new ModelBox(mandibulasup, 0, 0, 4.0F, -2.0F,
				-49.0F, 6, 1, 16, 0.0F, false));
		mandibulasup.cubeList.add(new ModelBox(mandibulasup, 0, 0, 5.0F, -2.0F,
				-54.0F, 4, 1, 5, 0.0F, false));
		mandibulasup.cubeList.add(new ModelBox(mandibulasup, 0, 0, 5.0F, -3.0F,
				-54.0F, 4, 1, 2, 0.0F, false));

		legrightfront = new ModelRenderer(this);
		legrightfront.setRotationPoint(0.0F, -6.0F, -25.0F);
		setRotationAngle(legrightfront, 0.0F, -0.1745F, 0.0F);
		Body.addChild(legrightfront);
		legrightfront.cubeList.add(new ModelBox(legrightfront, 0, 0, -1.0F,
				-1.0F, 0.0F, 2, 2, 6, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-2.9544F, 2.0F, 0.5209F);
		setRotationAngle(bone, 0.2618F, 0.4363F, 0.0F);
		legrightfront.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -1.0F, 0.0F, 2, 2, 6,
				0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone2, -0.2618F, -0.2618F, 0.0F);
		bone.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -1.0F, 0.0F, -3.0F, 2, 1,
				4, 0.0F, false));

		legrightfront2 = new ModelRenderer(this);
		legrightfront2.setRotationPoint(11.0F, -6.0F, -25.0F);
		setRotationAngle(legrightfront2, 0.0F, 0.1745F, 0.0F);
		Body.addChild(legrightfront2);
		legrightfront2.cubeList.add(new ModelBox(legrightfront2, 0, 0, 2.0F,
				-1.0F, 0.0F, 2, 2, 6, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(5.9544F, 2.0F, 0.5209F);
		setRotationAngle(bone7, 0.3491F, -0.5236F, 0.0F);
		legrightfront2.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -1.0F, -1.0F, 0.0F, 2, 2,
				6, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone8, -0.4363F, 0.3491F, -0.1745F);
		bone7.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, -1.0F, 0.0F, -3.0F, 2, 1,
				4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		Body.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y,
			float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}