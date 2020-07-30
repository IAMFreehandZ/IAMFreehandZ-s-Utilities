
package net.mcreator.freehandzsutilities.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.freehandzsutilities.FreehandzsUtilitiesModElements;

@FreehandzsUtilitiesModElements.ModElement.Tag
public class BedrockPickaxeItem extends FreehandzsUtilitiesModElements.ModElement {
	@ObjectHolder("freehandzs_utilities:bedrock_pickaxe")
	public static final Item block = null;
	public BedrockPickaxeItem(FreehandzsUtilitiesModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 6321;
			}

			public float getEfficiency() {
				return 65f;
			}

			public float getAttackDamage() {
				return 18f;
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
		}, 1, -1.5f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("bedrock_pickaxe"));
	}
}
