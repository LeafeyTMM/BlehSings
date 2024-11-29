package com.leafey.blehsings;

import net.minecraft.nbt.NbtCompound;

public class Mana {
	private Integer currentmana;
	private Integer maxmana;

	public Integer getCurrentMana() {
		return currentmana;
	}

	public Integer getMaxMana() {
		return maxmana;
	}

	public void addToCurrentMana(int add) {
		this.currentmana = Math.min(currentmana + add,maxmana);
	}

	public void addToMaxMana(int add) {
		maxmana += add;
	}

	public void setMaxMana(int num) {
		maxmana = num;
	}

	public void saveNBT(NbtCompound nbt) {
		nbt.putInt("currentmana",currentmana);
		nbt.putInt("maxmana",maxmana);
	}

	public void loadNBT(NbtCompound nbt) {
		currentmana = nbt.getInt("currentmana");
		maxmana = nbt.getInt("maxmana");
	}

}
