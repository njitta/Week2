
public class BookDetailsSingleton {
	
	
	private static BookDetailsSingleton uniqueInstance;
  
	private BookDetailsSingleton() {
		
	}
  
	public static BookDetailsSingleton getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating a new and unique instance for Book Publisher\n");
			uniqueInstance = new BookDetailsSingleton();
		}
		System.out.println("\nReturning the existing instance of Book Publisher");
		return uniqueInstance;
	}
	
	public void bookPrice()
	{
		System.out.println("Price for Algorithms Book = $40");
		System.out.println("Price for OOD Book = $50");
		System.out.println("Price for Accounting Book = $30");
		System.out.println("Price for Marketing Book = $44");
	}

}
