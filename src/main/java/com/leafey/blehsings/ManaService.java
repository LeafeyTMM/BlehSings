package com.leafey.blehsings;

import net.minecraft.nbt.NbtCompound;

public interface ManaService {
	public Integer getCurrentMana();
	public Integer getMaxMana();
	public void addToCurrentMana(int add);
	public void addToMaxMana(int add);
	public void setMaxMana(int num);
	public void saveNBT(NbtCompound nbt);
	public void loadNBT(NbtCompound nbt);

}
