package com.capgemini.bean;

public class CharactersCount {
	private String name;
	private int distinctCharacterCount;
	public CharactersCount(String name, int distinctCharacterCount) {
		super();
		this.name = name;
		this.distinctCharacterCount = distinctCharacterCount;
	}
	public CharactersCount() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDistinctCharacterCount() {
		return distinctCharacterCount;
	}
	public void setDistinctCharacterCount(int distinctCharacterCount) {
		this.distinctCharacterCount = distinctCharacterCount;
	}
	@Override
	public String toString() {
		return "CharactersCount [name=" + name + ", distinctCharacterCount=" + distinctCharacterCount + "]";
	}
	

}
