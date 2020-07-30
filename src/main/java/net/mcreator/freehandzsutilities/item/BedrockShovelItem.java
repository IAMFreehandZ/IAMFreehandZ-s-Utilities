
package net.mcreator.freehandzsutilities.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.freehandzsutilities.FreehandzsUtilitiesModElements;

@FreehandzsUtilitiesModElements.ModElement.Tag
public class BedrockShovelItem extends FreehandzsUtilitiesModElements.ModElement {
	@ObjectHolder("freehandzs_utilities:bedrock_shovel")
	public static final Item block = null;
	public BedrockShovelItem(FreehandzsUtilitiesModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 6521;
			}

			public float getEfficiency() {
				return 65f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -2f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("bedrock_shovel"));
	}
}
