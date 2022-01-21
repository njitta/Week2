
public class CSBookFactory implements BookFactory {
	
	 public Books publishBook(String bookname) {
	        
	        if("Algorithms".equalsIgnoreCase(bookname)) {
	            return new Algorithms();
	        }  
	        if("OOD".equalsIgnoreCase(bookname)) {
	            return new OOD();
	        }
	        return null;
	    }

}
