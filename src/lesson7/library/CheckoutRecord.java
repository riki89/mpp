package lesson7.library;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> checkoutEntryList = new ArrayList<CheckoutRecordEntry>();
	
	public void addCheckoutEntry(CheckoutRecordEntry ce)
	{
		this.checkoutEntryList.add(ce);
	}

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return checkoutEntryList;
	}

}
