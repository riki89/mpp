package lesson7.library;

public class LendingItem {
	private Integer numCopiesInLib;

	public Integer getNumCopiesInLib() {
		return numCopiesInLib;
	}

	public void setNumCopiesInLib(Integer numCopiesInLib) {
		this.numCopiesInLib = numCopiesInLib;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj == this) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		if (obj instanceof Book && this instanceof Book)
		{
			Book paramBook = (Book) obj;
			Book currentBook = (Book)this;
			
			if (currentBook.getIsbn().equals(paramBook.getIsbn())
					&& currentBook.getAuthorFirstName().equals(paramBook.getAuthorFirstName())
							&& currentBook.getAuthorLastName().equals(paramBook.getAuthorLastName())
							&& currentBook.getTitle().equals(paramBook.getTitle())
					)
			{

				return true;
			}
		}
		if (obj instanceof CD && this instanceof CD)
		{
			CD paramBook = (CD) obj;
			CD currentBook = (CD)this;
			
			if (currentBook.getTitle().equals(paramBook.getTitle())
					&& currentBook.getProductId().equals(paramBook.getProductId())
							&& currentBook.getComapny().equals(paramBook.getComapny())
					)
			{

				return true;
			}
		}

		return false;
	}

	
}
