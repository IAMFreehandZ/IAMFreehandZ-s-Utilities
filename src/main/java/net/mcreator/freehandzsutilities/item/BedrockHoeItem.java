
package net.mcreator.freehandzsutilities.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.freehandzsutilities.FreehandzsUtilitiesModElements;

@FreehandzsUtilitiesModElements.ModElement.Tag
public class BedrockHoeItem extends FreehandzsUtilitiesModElements.ModElement {
	@ObjectHolder("freehandzs_utilities:bedrock_hoe")
	public static final Item block = null;
	public BedrockHoeItem(FreehandzsUtilitiesModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 6280;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 3f;
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
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("bedrock_hoe"));
	}
}
