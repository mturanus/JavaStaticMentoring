package staticVariable;

public class Parking {
	
	static int numberofSpace=30; 

	public void parkACar(String model) {
		// TODO Auto-generated method stub
		
		System.out.println("Parked car is "+model);
		
		numberofSpace--; 
		
	}

	public boolean avaliableSpace() {
		// TODO Auto-generated method stub	
		
		if(numberofSpace>0) {
			
			System.out.println("Avaliable space is "+numberofSpace);
			
			return true; 
		}
		return false;
	}
	
	
	
	
	

}
