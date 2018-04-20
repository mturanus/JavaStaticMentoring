
public class Animal {
	
	int num; 
	
	static int num1; 
	
	public Animal() {
		
		this.num=10; 
		System.out.println("fanatik");
		num1=10; 
	}
	
public Animal(int num) {
		
		this.num=10; 
		System.out.println("fanatik");
		
		num1=10; 
	}
	
	
	public void Animal() {
		
		
	}
	
	public static void main(String[] args) {
		
		Animal obj=new Animal(); 
		Animal obj2= new Animal (); 
		
		
		
		obj.num=11; 
		
		obj.num1=16; 
		
		obj2.num1=12; 
		
		obj2.num=14; 
		
		
		
		System.out.println(obj.num);
		
		System.out.println(obj.num1);
		
		//System.out.println(obj2.num);
		
	//	System.out.println(obj2.num1);
		
		
		
		
		
	}
	
	

}
