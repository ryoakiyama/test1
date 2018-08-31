
public class Person {
	public String name = null;
	public int age = 0;
	public String address = null;
	public void talk(){
		System.out.println(this.name+"が話す");
	}
	public void eat(){
		System.out.println(this.name+"が食べる");
	}
	
	public Person(){};
	
	public Person(String name){
		this.name = name;
		this.age = 0;
	}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Person(int age){
		this.name ="名前がない人";
		this.age = age;
	}
	
	public Person(int age,String name){
		this.name = name;
		this.age= age;
	}
	
	public Person(String name,String address){
		this.name = name;
		this.address = address;
		
	}

}
