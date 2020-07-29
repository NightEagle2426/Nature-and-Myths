
package net.mcreator.natureandmyths.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.natureandmyths.itemgroup.SpawnEggsItemGroup;
import net.mcreator.natureandmyths.NatureandmythsModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.matrix.MatrixStack;

@NatureandmythsModElements.ModElement.Tag
public class KiwiBirdEntity extends NatureandmythsModElements.ModElement {
	public static EntityType entity = null;
	public KiwiBirdEntity(NatureandmythsModElements instance) {
		super(instance, 445);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.AMBIENT).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.4f, 0.4f)).build("kiwi_bird")
						.setRegistryName("kiwi_bird");
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -10734310, -5925758, new Item.Properties().group(SpawnEggsItemGroup.tab))
				.setRegistryName("kiwi_bird"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			boolean biomeCriteria = false;
			if (ForgeRegistries.BIOMES.getKey(biome).equals(new ResourceLocation("forest")))
				biomeCriteria = true;
			if (!biomeCriteria)
				continue;
			biome.getSpawns(EntityClassification.AMBIENT).add(new Biome.SpawnListEntry(entity, 1, 1, 2));
		}
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS,
				Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canSpawnOn);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelKiwi(), 0.4f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("natureandmyths:textures/kiwi-texturemap.png");
				}
			};
		});
	}
	public static class CustomEntity extends AnimalEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 1;
			setNoAI(false);
			enablePersistence();
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new PanicGoal(this, 3.5));
			this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1.5));
			this.goalSelector.addGoal(3, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(4, new SwimGoal(this));
			this.goalSelector.addGoal(5, new RandomSwimmingGoal(this, 0.3, 40));
			this.goalSelector.addGoal(6, new FollowParentGoal(this, 1));
			this.goalSelector.addGoal(7, new LeapAtTargetGoal(this, (float) 0.5));
			this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, (float) 10));
			this.goalSelector.addGoal(9, new AvoidEntityGoal(this, PlayerEntity.class, (float) 6, 1, 1.2));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
			this.entityDropItem(new ItemStack(Items.FEATHER, (int) (1)));
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.CACTUS)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3);
		}

		@Override
		public AgeableEntity createChild(AgeableEntity ageable) {
			return (CustomEntity) entity.create(this.world);
		}

		@Override
		public boolean isBreedingItem(ItemStack stack) {
			if (stack == null)
				return false;
			if (new ItemStack(Items.WHEAT_SEEDS, (int) (1)).getItem() == stack.getItem())
				return true;
			if (new ItemStack(Items.PUMPKIN_SEEDS, (int) (1)).getItem() == stack.getItem())
				return true;
			if (new ItemStack(Items.MELON_SEEDS, (int) (1)).getItem() == stack.getItem())
				return true;
			return false;
		}
	}

	/**
	 * Kiwi - NightEagle2426 Created using Tabula 7.1.0
	 */
	public static class ModelKiwi extends EntityModel<Entity> {
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
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			GlStateManager.pushMatrix();
			GlStateManager.scaled(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
			this.Body.render(ms, vb, i1, i2, f1, f2, f3, f4);
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

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head1.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
