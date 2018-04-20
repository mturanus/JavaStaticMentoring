package staticVariable;

public class Cat {
	
	
	public static void main(String[] args) {
		
		Animal dodo= new Animal(); 
		
		//Animal kitty=new Animal(); 
		
		
		dodo.dailyAmount(1);
		
		//kitty.dailyAmount(2);
		
		System.out.println(dodo.age);
		
		dodo.age=5; 
		
		System.out.println(dodo.age);
		
		dodo=null; 
		
		System.out.println(dodo.age);
		
		

		
		
		
		
	}

}
