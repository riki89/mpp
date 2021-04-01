package lesson7.library;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private ItemType itemType;
	private LendingItem lendingItem;
	
	public CheckoutRecordEntry(LendingItem lendingItem, LocalDate checkoutDate, LocalDate dueDate, ItemType itemType) {
		super();
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.itemType = itemType;
		this.lendingItem = lendingItem;
	}
	
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public ItemType getItemType() {
		return itemType;
	}
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	public LendingItem getLendingItem() {
		return lendingItem;
	}
	public void setLendingItem(LendingItem lendingItem) {
		this.lendingItem = lendingItem;
	}
	
}
