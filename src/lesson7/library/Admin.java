package lesson7.library;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		//implement
		for (LibraryMember member : members) {
			if (!member.getCheckoutRecord().equals(null))
			{
				for (CheckoutRecordEntry checkout : member.getCheckoutRecord().getCheckoutEntryList()) {
					if (checkout.getLendingItem().equals(item))
					{
						phoneNums.add(member.getPhone());
					}
				}
			}
		}
		//short List
		Collections.sort(phoneNums);
		return phoneNums;
	}
}