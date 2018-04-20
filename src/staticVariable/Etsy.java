package staticVariable;

public class Etsy {

	
	public Etsy() {
		
		System.out.println(item);
		
	}
	
   static String item="spoon"; 
	
	public void selectItem() {
		
		System.out.println("select"+ item);
	}
	
	
	
	public static void navigate(String url) {
		
		System.out.println("Navigating to "+ url);
	}
	
	public static void login(String userName, String password) {
		
		System.out.println("Logging to Etsy username: "+ userName+" -pwd: "+ password);
	}
	
	public static void search(String item) {
		
		System.out.println("Searching for "+ item);
		
		
	}
	
	
	
}
