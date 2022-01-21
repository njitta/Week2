
public class BookTest {

	public static void main(String[] args) {
		
		System.out.println("\n\n **** Factory Design pattern *****\n\n");
		////////////////  Factory Design Pattern Start  //////////////////////
		//CS Book Publisher   
		BookFactory CSBookFactory = BookPublisherFactory.getBookFactory("CS");       
		Books Algorithms = CSBookFactory.publishBook("Algorithms");
		Algorithms.publish();
		Books OOD = CSBookFactory.publishBook("OOD");
		OOD.publish();
	        
	     
		 
		//CS Book Publisher
		BookFactory BBABookFactory = BookPublisherFactory.getBookFactory("BBA");       		 
		Books Accounting = BBABookFactory.publishBook("Accounting");
		Accounting.publish();
		Books Marketing = BBABookFactory.publishBook("Marketing");
		Marketing.publish();
		 
		////////////////Factory Design Pattern End  //////////////////////
		 
		System.out.println("\n\n **** Singleton Design pattern *****\n\n");
		////////////////Singleton Design Pattern End  ////////////////////// 
		BookDetailsSingleton book = BookDetailsSingleton.getInstance();
		book.bookPrice();

		//to get the existed instance
		BookDetailsSingleton book1 = BookDetailsSingleton.getInstance();
		 
		////////////////Singleton Design Pattern End  //////////////////////	
			
			
	}

}
