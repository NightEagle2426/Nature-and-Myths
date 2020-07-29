
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
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.natureandmyths.procedures.PlatypusEntityIsHurtProcedure;
import net.mcreator.natureandmyths.itemgroup.SpawnEggsItemGroup;
import net.mcreator.natureandmyths.NatureandmythsModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@NatureandmythsModElements.ModElement.Tag
public class PlatypusEntity extends NatureandmythsModElements.ModElement {
	public static EntityType entity = null;
	public PlatypusEntity(NatureandmythsModElements instance) {
		super(instance, 446);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.WATER_CREATURE)
				.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
				.size(0.7f, 0.5f)).build("platypus").setRegistryName("platypus");
		elements.entities.add(() -> entity);
		elements.items.add(
				() -> new SpawnEggItem(entity, -14483516, -1149696, new Item.Properties().group(SpawnEggsItemGroup.tab)).setRegistryName("platypus"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			boolean biomeCriteria = false;
			if (ForgeRegistries.BIOMES.getKey(biome).equals(new ResourceLocation("river")))
				biomeCriteria = true;
			if (!biomeCriteria)
				continue;
			biome.getSpawns(EntityClassification.WATER_CREATURE).add(new Biome.SpawnListEntry(entity, 3, 3, 4));
		}
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				SquidEntity::func_223365_b);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelPlatypus(), 0.4f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("natureandmyths:textures/platypus-texturemap.png");
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
			experienceValue = 0;
			setNoAI(false);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(2, new RandomSwimmingGoal(this, 6, 40));
			this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(5, new SwimGoal(this));
			this.goalSelector.addGoal(6, new LeapAtTargetGoal(this, (float) 0.5));
			this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, (float) 6));
			this.goalSelector.addGoal(8, new PanicGoal(this, 1.8));
			this.goalSelector.addGoal(9, new FollowParentGoal(this, 0.8));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
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
			int x = (int) this.getPosX();
			int y = (int) this.getPosY();
			int z = (int) this.getPosZ();
			Entity entity = this;
			Entity sourceentity = source.getTrueSource();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				PlatypusEntityIsHurtProcedure.executeProcedure($_dependencies);
			}
			if (source == DamageSource.DROWN)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2);
		}

		@Override
		public AgeableEntity createChild(AgeableEntity ageable) {
			return (CustomEntity) entity.create(this.world);
		}

		@Override
		public boolean isBreedingItem(ItemStack stack) {
			if (stack == null)
				return false;
			return false;
		}
	}

	/**
	 * Platypus - NightEagle2426 Created using Tabula 7.1.0
	 */
	public static class ModelPlatypus extends EntityModel<Entity> {
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
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			this.Body1.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Frontlegleft.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Frontlegleft_1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Leftlegback.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Rightlegback.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
