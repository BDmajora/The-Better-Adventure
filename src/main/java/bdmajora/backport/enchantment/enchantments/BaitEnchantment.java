package bdmajora.backport.enchantment.enchantments;

import bdmajora.backport.enchantment.Enchantment;
import bdmajora.backport.enchantment.EnchantmentTarget;

public class BaitEnchantment extends Enchantment
{
	public BaitEnchantment(String name, int id, Rarity weight, EnchantmentTarget target)
	{
		super(name, id, weight, target);
	}

	@Override
	public int getMaxLevel()
	{
		return 3;
	}

	@Override
	public int getMinEnchantability(int level)
	{
		return 15 + (level - 1) * 9;
	}

	@Override
	public int getMaxEnchantability(int level)
	{
		return super.getMaxEnchantability(level) + 50;
	}
}
