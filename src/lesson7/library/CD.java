package lesson7.library;

public class CD extends LendingItem{
	private String productId;
	private String title;
	private String comapny;
	
	public CD(String productId, String title, String comapny) {
		this.productId = productId;
		this.title = title;
		this.comapny = comapny;
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
	public String getComapny() {
		return comapny;
	}
	public void setComapny(String comapny) {
		this.comapny = comapny;
	}
}
