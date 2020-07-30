
package net.mcreator.freehandzsutilities.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.freehandzsutilities.FreehandzsUtilitiesModElements;

@FreehandzsUtilitiesModElements.ModElement.Tag
public class BedrockAxeItem extends FreehandzsUtilitiesModElements.ModElement {
	@ObjectHolder("freehandzs_utilities:bedrock_axe")
	public static final Item block = null;
	public BedrockAxeItem(FreehandzsUtilitiesModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 6521;
			}

			public float getEfficiency() {
				return 65f;
			}

			public float getAttackDamage() {
				return 58f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, 1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("bedrock_axe"));
	}
}
