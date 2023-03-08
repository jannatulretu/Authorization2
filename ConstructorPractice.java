package BasicJava;

public class ConstructorPractice {
   //non parameterized
	ConstructorPractice(){
		int a1= 222;
		String nim= "yourat can do it";
		System.out.println("non parameterized");
		System.out.println(a1);
		System.out.println(nim);


	}
	//parameterized
	ConstructorPractice(String price,int nums){
		String ss = "I have to put the value  this will execute the upper one";
		System.out.println(price);
		System.out.println(nums);

	}
	String order() {
		int vt= 90;
		
		String result = "p";
		return  result;

	}
	public static void main(String[] args) {
		ConstructorPractice consPrac= new ConstructorPractice();
		//by creating this object we will get the constructor, so no need to call this with the object name
		//but when we crate a new class, by default a constructor is also created for the class
		
		ConstructorPractice cin= new ConstructorPractice("I have to put  value  this will execute the upper one",3333);
		ConstructorPractice con= new ConstructorPractice();

		
		System.out.println(cin.order());
		System.out.println(consPrac.order());
		System.out.println(con.order());



	}

}
