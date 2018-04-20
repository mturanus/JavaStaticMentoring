package staticVariable;

public class MainParking {
	

	public static void main(String[] args) {
		
		Parking.numberofSpace=10; 
		
		
		Parking p1=new Parking(); 
		
		p1.parkACar("TestLa S"); 
		
		p1.parkACar("Nissan S"); 

		p1.parkACar("Acura TL"); 

		
		System.out.println(p1.avaliableSpace());
		
		Parking p2= new Parking(); 
		
		p2.parkACar("MiniCooper"); 
		
		System.out.println(p1.avaliableSpace());
		
		System.out.println(p2.avaliableSpace());
		

		
		
	} 

}
