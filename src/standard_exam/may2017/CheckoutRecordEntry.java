package standard_exam.may2017;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private ItemType type;
	
	private LendingItem item;
	
	public CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type) {
		this.item = item;
		this.checkoutDate = chDate;
		this.dueDate = dueDate;
		this.type = type;
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

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public LendingItem getItem() {
		return item;
	}

	public void setItem(LendingItem item) {
		this.item = item;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!CheckoutRecordEntry.class.isInstance(obj)) return false;
		
		LendingItem lendItem = ((CheckoutRecordEntry) obj).getItem();
		if (this.item.equals(lendItem)) return true;
		return false;
	}
}