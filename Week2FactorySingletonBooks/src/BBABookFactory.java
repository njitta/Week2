
public class BBABookFactory implements BookFactory {
	
	 public Books publishBook(String bookname) {
	        
	        if("Accounting".equalsIgnoreCase(bookname)) {
	            return new Accounting();
	        }  
	        if("Marketing".equalsIgnoreCase(bookname)) {
	            return new Marketing();
	        }
	        return null;
	    }

}
