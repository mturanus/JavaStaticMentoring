package staticVariable;

public class Animal {
	
	static int foodAmount=50; 
	
	static int age= 6; 
	
	
	public void dailyAmount(int amount) {
		
		foodAmount-=amount; 
		
		System.out.println("Remaining amount is "+ foodAmount);
	}
	
	
	public boolean isFoodAvaliable() {
		
		if (foodAmount>0) {
			
			return true; 
		}
		
		return false; 
	}
	
	

}
