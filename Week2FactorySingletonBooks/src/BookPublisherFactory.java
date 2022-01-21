
public class BookPublisherFactory {
	
public static BookFactory getBookFactory(String bookfactoryType) {
        
        if("CS".equalsIgnoreCase(bookfactoryType)) {
            return new CSBookFactory();
        }  
        if("BBA".equalsIgnoreCase(bookfactoryType)) {
            return new BBABookFactory();
        }
        
        return null;
    }

}
