package staticVariable;

public class EtsyMain {
	
	public static void main(String[] args) {
		Etsy etsy=new Etsy(); 
		
		Etsy.navigate(EtsyTestData.url);
		
		Etsy.login(EtsyTestData.userId, EtsyTestData.password);
		
		Etsy.search(EtsyTestData.searchItem);
		
		System.out.println(10*9);
	}

}
