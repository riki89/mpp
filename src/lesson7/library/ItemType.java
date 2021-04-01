package lesson7.library;

public enum ItemType {
	BOOK("BOOK"), CD("CD");
	private String item;
	
	private ItemType(String li)
	{
		this.item = li;
	}
	
	public String getLi() {
		return this.item;
	}
	
}
