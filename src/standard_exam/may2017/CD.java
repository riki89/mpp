package standard_exam.may2017;

public class CD extends LendingItem{
	private String productId;
	private String title;
	private String company;
	
	public CD(String productId, String title, String company) {
		this.productId = productId;
		this.title = title;
		this.company = company;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!CD.class.isInstance(obj)) return false;
		
		String productId = ((CD) obj).getProductId();
		if (this.productId.equals(productId)) return true;
		return false;
	}
}